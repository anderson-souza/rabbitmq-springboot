package com.aps.rabbitmqspringboot.service;

import com.aps.rabbitmqspringboot.dto.Message;

public interface AmqpService {

    void sendToConsumer(Message message);

}
