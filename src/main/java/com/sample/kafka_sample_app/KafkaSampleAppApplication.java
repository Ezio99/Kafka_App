package com.sample.kafka_sample_app;

import com.sample.kafka_sample_app.Service.KafkaProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSampleAppApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(KafkaProducer producer){
//		return args -> {
//			producer.sendMessage("Hello World from Spring Boot to Docker!");
//		};
//	}

}
