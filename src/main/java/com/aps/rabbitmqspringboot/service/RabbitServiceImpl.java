package com.aps.rabbitmqspringboot.service;

import com.aps.rabbitmqspringboot.amqp.AmqpProducer;
import com.aps.rabbitmqspringboot.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitServiceImpl implements AmqpService {

    @Autowired
    AmqpProducer<Message> producerRabbitMQ;

    @Override
    public void sendToConsumer(Message message) {
        producerRabbitMQ.produce(message);
    }

}
