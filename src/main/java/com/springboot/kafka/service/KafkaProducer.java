/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboot.kafka.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducer {
    
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * This method sends message to the configured myTopic kafka topic 
     * 
     * @param message 
     */
    public void sendMessage(String message) {
        logger.info(String.format("Message sent as : %s", message));
        kafkaTemplate.send("myTopic", message);
    }
}
