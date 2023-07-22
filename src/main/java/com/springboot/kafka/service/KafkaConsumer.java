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
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    /**
     * Whenever KafkaProducer will send message to Kafka Topic then this
     * Subscriber method will receive the message from myTopic kafka topic
     *
     * @param message
     */
    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consume(String message) {
        logger.info(String.format("Message received as : %s", message));   
    }

}
