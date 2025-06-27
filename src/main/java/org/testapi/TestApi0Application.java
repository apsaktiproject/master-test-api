package org.testapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"org.testapi.controller"})
public class TestApi0Application {

	public static void main(String[] args) {
		SpringApplication.run(TestApi0Application.class, args);
	}

}
