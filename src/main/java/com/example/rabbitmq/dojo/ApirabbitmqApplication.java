package com.example.rabbitmq.dojo;
/**
 * 
 * @see lab RabbitMQ
 * 
 * @author s4u10 
 * 
 */

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
