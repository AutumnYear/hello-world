package com.study.helloworld.design.pattern.strategy.impl;

import com.study.helloworld.design.pattern.strategy.SendPrizeRequest;

/**
 * Created by qiunian on 2019/06/12.
 */
public interface PrizeSender {

    /**
     * 用于判断当前实例是否支持当前奖励的发放
     */
    boolean support(SendPrizeRequest request);

    /**
     * 发放奖励
     */
    void sendPrize(SendPrizeRequest request);

}
