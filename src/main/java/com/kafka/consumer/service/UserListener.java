package com.kafka.consumer.service;

import com.kafka.consumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;


@Service
public class UserListener {
    private static final Logger LOG = LoggerFactory.getLogger(UserListener.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }


    @KafkaListener(topics = "simpletopic",group = "group_json",containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessage(User user) {
       LOG.info("Consumed Message-->" + user.toString());
        latch.countDown();

    }

}

