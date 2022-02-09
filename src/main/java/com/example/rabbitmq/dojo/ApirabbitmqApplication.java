package com.example.rabbitmq.dojo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class ApirabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirabbitmqApplication.class, args);
	}

}
