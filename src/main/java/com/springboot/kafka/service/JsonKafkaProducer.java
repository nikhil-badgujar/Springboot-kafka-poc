/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboot.kafka.service;

import com.springboot.kafka.payload.User;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JsonKafkaProducer {
    
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);
    
    private KafkaTemplate<String, User> kafkaTemplate;
    
    public void sendMessage(User user) {
        logger.info(String.format("Json Message sent as : %s", user.toString()));
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "myJsonTopic")
                .build();
        kafkaTemplate.send(message);
    }
    
}
