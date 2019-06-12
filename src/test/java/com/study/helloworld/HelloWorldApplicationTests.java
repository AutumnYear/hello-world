package com.study.helloworld;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldApplicationTests {

	private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldApplicationTests.class);

	@Test
	public void test(){
		LOGGER.info("test success!!!");
	}

}
