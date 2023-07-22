/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboot.kafka.service;

import com.springboot.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    
    @KafkaListener(topics = "myJsonTopic", groupId = "myGroup")
    public void consumer(User user) {
        logger.info(String.format("User received -: %s", user.toString()));
    }
}
