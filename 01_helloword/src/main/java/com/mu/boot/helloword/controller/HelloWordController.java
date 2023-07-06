package com.mu.boot.helloword.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @RestController ����springmvc�� @Controller��@ResponseBody���ʹ�õ�ע��
 */
@RestController
public class HelloWordController {

    /**
     * @GetMappingע���ֵ��servlet���doGet����,ֻ����get����
     * @GetMapping ��ֵ�� @RequestMapping(value = "/hello",method = RequestMethod.GET)
     */
    @GetMapping("/hello")
    public String helloword(){
        return "Hello springboot  get method";
    }

    /**
     * @PostMappingע���ֵ��servlet���doPost����,ֻ����post����
     * @PostMapping ��ֵ�� @RequestMapping(value = "/hello",method = RequestMethod.POST)
     */
    @PostMapping("/hello")
    public String helloword_post(){
        return "Hello springboot  post method";
    }
}
