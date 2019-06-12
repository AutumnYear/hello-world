package com.study.helloworld.design.pattern.strategy;

import com.study.helloworld.design.pattern.strategy.impl.CashSender;
import com.study.helloworld.design.pattern.strategy.impl.PointSender;
import com.study.helloworld.design.pattern.strategy.impl.PrizeSender;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiunian on 2019/06/12.
 */
@Component
public class PrizeSenderFactory {

    public PrizeSender getPrizeSender(SendPrizeRequest request) {
        List<PrizeSender> prizeSenders = getPrizeSenders();
        for (PrizeSender prizeSender : prizeSenders) {
            if (prizeSender.support(request)) {
                return prizeSender;
            }
        }
        throw new UnsupportedOperationException("unsupported request: " + request);
    }

    private List<PrizeSender> getPrizeSenders() {
        List<PrizeSender> prizeSenders = new ArrayList<>();
        PrizeSender pointSender = new PointSender();
        prizeSenders.add(pointSender);
        PrizeSender cashSender = new CashSender();
        prizeSenders.add(cashSender);
        PrizeSender virtualCurrencySender = new VirtualCurrencySender();
        prizeSenders.add(virtualCurrencySender);
        return prizeSenders;
    }
}
