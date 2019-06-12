package com.study.helloworld;

import com.study.helloworld.design.pattern.strategy.impl.PrizeSender;
import com.study.helloworld.design.pattern.strategy.PrizeSenderFactory;
import com.study.helloworld.design.pattern.strategy.PrizeTypeEnum;
import com.study.helloworld.design.pattern.strategy.SendPrizeRequest;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PrizeSenderFactory.class)
public class HelloWorldApplicationTests {

	@Test
	public void test(){
		SendPrizeRequest request = new SendPrizeRequest();
		request.setPrizeType(PrizeTypeEnum.CASH);
		PrizeSender prizeSender = new PrizeSenderFactory().getPrizeSender(request);
		prizeSender.sendPrize(request);
	}

}
