package com.sample.kafka_sample_app.Controller;

import com.sample.kafka_sample_app.Service.KafkaProducer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class WebContoller {

    private final KafkaProducer kafkaProducer;

    public WebContoller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent";
    }
}
