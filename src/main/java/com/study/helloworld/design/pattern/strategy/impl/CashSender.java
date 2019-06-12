package com.study.helloworld.design.pattern.strategy.impl;

import com.study.helloworld.design.pattern.strategy.PrizeTypeEnum;
import com.study.helloworld.design.pattern.strategy.SendPrizeRequest;
import org.springframework.stereotype.Component;

/**
 * 现金发放
 */
@Component
public class CashSender implements PrizeSender{
    @Override
    public boolean support(SendPrizeRequest request) {
        return PrizeTypeEnum.CASH == request.getPrizeType();
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放现金");
    }
}
