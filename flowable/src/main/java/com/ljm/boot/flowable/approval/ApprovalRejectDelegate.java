package com.mu.boot.flowable.approval;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author Mr.yuan
 * @Description
 * @CreateTime 2022/10/28 10:25
 **/
public class ApprovalRejectDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("审批驳回了");
    }
}
