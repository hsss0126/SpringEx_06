package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = "classpath:applicationCTX.xml";
		try(AbstractApplicationContext ctx = new GenericXmlApplicationContext(config)){
			Student hyunseok = ctx.getBean("hyunseok", Student.class);
			System.out.println(hyunseok.getName());
			System.out.println(hyunseok.getHeight());
			System.out.println(hyunseok.getWeight());
			System.out.println(hyunseok.getAge());
			System.out.println(hyunseok.getFamily().getFatherName());
			System.out.println(hyunseok.getFamily().getMotherName());
			System.out.println(hyunseok.getFamily().getBrotherName());
			System.out.println("=========================================");
			Student hyunsook = ctx.getBean("hyunsook", Student.class);
			System.out.println(hyunsook.getName());
			System.out.println(hyunsook.getHeight());
			System.out.println(hyunsook.getWeight());
			System.out.println(hyunsook.getAge());
			System.out.println(hyunsook.getFamily().getFatherName());
			System.out.println(hyunsook.getFamily().getMotherName());
			System.out.println(hyunsook.getFamily().getSisterName());
		}
	}

}
