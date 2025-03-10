package com.spring_test.learn_spring_framework;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a Spring Context

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		//2. Configure the things that we want Spring to manage -@Configuration Class
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		
		//3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person")); //toString is automatically implemented
		System.out.println(context.getBean("address"));
	}

}
