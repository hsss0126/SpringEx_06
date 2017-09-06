package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Family yourFamily(){

		Family family = new Family("장인어른", "장모님");
		family.setSisterName("노수연");

		return family;
	}

	@Bean
	public Student hyunsook(){

		Student student = new Student("노현숙");
		student.setHeight(167);
		student.setWeight(45);
		student.setAge(25);
		student.setFamily(yourFamily());
		return student;
	}
}
