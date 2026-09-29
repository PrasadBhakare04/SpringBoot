package com.prasad.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		Dev dev = context.getBean(Dev.class);
//		dev.greet();

		Programmer programmer = context.getBean(Programmer.class);

		programmer.build();
	}

}
