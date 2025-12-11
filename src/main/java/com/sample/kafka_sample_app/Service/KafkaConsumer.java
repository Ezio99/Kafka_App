package com.sample.kafka_sample_app.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "spring-demo-group")
    public void consume(String message) {
        System.out.printf("Received message %s \n", message);
    }
}
