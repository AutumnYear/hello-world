package com.study.helloworld.design.pattern.strategy.impl;

import com.study.helloworld.design.pattern.strategy.PrizeTypeEnum;
import com.study.helloworld.design.pattern.strategy.SendPrizeRequest;
import org.springframework.stereotype.Component;

/**
 * 积分发放
 */
@Component
public class PointSender implements PrizeSender{
    @Override
    public boolean support(SendPrizeRequest request) {
        return request.getPrizeType() == PrizeTypeEnum.POINT;
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放积分");
    }
}
