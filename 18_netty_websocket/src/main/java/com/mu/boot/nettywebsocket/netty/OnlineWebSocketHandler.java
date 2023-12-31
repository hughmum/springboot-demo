package com.mu.boot.nettywebsocket.netty;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mu.boot.nettywebsocket.model.OnlineMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelId;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Mr.yuan
 * @CreateTime 2020/5/14 16:36
 * @description 处理在线聊天功能
 **/
public class OnlineWebSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private final Logger logger = LoggerFactory.getLogger(TestWebSocketHandler.class);

    /**
     * 存储已经登录用户的channel对象
     */
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    /**
     * 存储用户id和用户的channelId绑定
     */
    public static ConcurrentHashMap<String, ChannelId> userMap = new ConcurrentHashMap<>();


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        logger.info("与客户端建立连接，通道开启！");
        //添加到channelGroup通道组
        channelGroup.add(ctx.channel());
        //ctx.channel().id();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        logger.info("与客户端断开连接，通道关闭！");
        //添加到channelGroup 通道组
        channelGroup.remove(ctx.channel());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //首次连接是FullHttpRequest，把用户id和对应的channel对象存储起来
        if (null != msg && msg instanceof FullHttpRequest) {
            FullHttpRequest request = (FullHttpRequest) msg;
            String uri = request.uri();
            String userId = getUrlParams(uri);
            //登录后把用户id和channel关联上
            userMap.put(userId, ctx.channel().id());
            logger.info("登录的用户id是：{}", userId);
            //如果url包含参数，需要处理
            if (uri.contains("?")) {
                String newUri = uri.substring(0, uri.indexOf("?"));
                request.setUri(newUri);
            }

        } else if (msg instanceof TextWebSocketFrame) {
            //正常的TEXT消息类型
            TextWebSocketFrame frame = (TextWebSocketFrame) msg;
            logger.info("客户端收到服务器数据：{}", frame.text());
            OnlineMessage onlineMessage = JSON.parseObject(frame.text(), OnlineMessage.class);
            //处理私聊的任务，如果对方也在线,则推送消息
            ChannelId channelId = userMap.get(onlineMessage.getAcceptId());
            if (channelId != null) {
                Channel ct = channelGroup.find(channelId);
                if (ct != null) {
                    ct.writeAndFlush(new TextWebSocketFrame(JSONObject.toJSONString(onlineMessage)));
                }
            }
        }
        super.channelRead(ctx, msg);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) throws Exception {

    }

    /**
     * 解析url中的参数
     * @return 获取用户的id
     */
    private String getUrlParams(String url) {
        if (!url.contains("=")) {
            return null;
        }
        String userId = url.substring(url.indexOf("=") + 1);
        return userId;
    }
}
