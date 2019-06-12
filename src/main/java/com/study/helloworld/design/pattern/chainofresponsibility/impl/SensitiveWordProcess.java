package com.study.helloworld.design.pattern.chainofresponsibility.impl;

import com.study.helloworld.design.pattern.chainofresponsibility.Process;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/10/21 23:56
 * @since JDK 1.8
 */
public class SensitiveWordProcess implements Process {
    @Override
    public void doProcess(String msg) {
        System.out.println(msg + "敏感词处理");
    }
}
