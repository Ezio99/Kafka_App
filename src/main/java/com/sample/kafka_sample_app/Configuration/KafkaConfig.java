package com.sample.kafka_sample_app.Configuration;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaConfig {

    private final KafkaAdmin kafkaAdmin;

    public KafkaConfig(KafkaAdmin kafkaAdmin) {
        this.kafkaAdmin = kafkaAdmin;
    }

    @Bean
    public NewTopic demoTopic() {
        //Builder design pattern

        return TopicBuilder.name("DemoTopic")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
