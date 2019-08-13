package com.kafka.consumer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.consumer.model.User;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

public class CustomKafkaJsonDeserialzer implements Deserializer {

    private Logger logger = LogManager.getLogger(this.getClass());

    private Class<User> type;

    public CustomKafkaJsonDeserialzer(Class type) {
        this.type = type;
    }

    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public Object deserialize(String s, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        User obj = null;
        try {
            obj = mapper.readValue(bytes, type);
        } catch (Exception e) {

            logger.error(e.getMessage());
        }
        return obj;
    }

    @Override
    public void close() {

    }
}
