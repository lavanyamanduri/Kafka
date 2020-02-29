package com.bridgelabz.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.bridgelabz.kafka.model.User;

@Service
public class KafkaConsumers {


    @KafkaListener(topics = "Kafka_Example_json",containerFactory = "userKafkaListenerFactory" ,groupId = "group_id")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}