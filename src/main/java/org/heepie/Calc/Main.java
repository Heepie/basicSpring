package org.heepie.Calc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		MyCalc calc = ctx.getBean("MyCalc", MyCalc.class);
		
		calc.add();
		calc.div();
		calc.multi();
		calc.minus();
	}
}
