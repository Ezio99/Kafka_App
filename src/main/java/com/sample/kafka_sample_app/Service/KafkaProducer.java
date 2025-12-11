package com.sample.kafka_sample_app.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(String message) {
        System.out.println(String.format("#### -> Producer sending message -> %s", message));

        // The simple send method: (Topic Name, The Data)
        kafkaTemplate.send("demo-topic", message);
    }
}
