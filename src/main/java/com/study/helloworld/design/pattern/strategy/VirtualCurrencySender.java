package com.study.helloworld.design.pattern.strategy;

import com.study.helloworld.design.pattern.strategy.impl.PrizeSender;
import org.springframework.stereotype.Component;

/**
 * 虚拟币发放
 */
@Component
public class VirtualCurrencySender implements PrizeSender {
    @Override
    public boolean support(SendPrizeRequest request) {
        return PrizeTypeEnum.VIRTUAL_CURRENCY == request.getPrizeType();
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放虚拟币");
    }
}
