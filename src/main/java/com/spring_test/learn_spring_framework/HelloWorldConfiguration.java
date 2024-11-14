package com.spring_test.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record: released in JDK 16, remove the necessities of creating getter, setter, toString for Bean
record Person(String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sonic";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20);
		return person;
	}
	
	@Bean
	public Address address() {
		var address = new Address ("Baker Street", "London");
		return address;
	}
}
