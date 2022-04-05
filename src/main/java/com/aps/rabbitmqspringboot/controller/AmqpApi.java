package com.aps.rabbitmqspringboot.controller;

import com.aps.rabbitmqspringboot.dto.Message;
import com.aps.rabbitmqspringboot.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpApi {

    @Autowired
    AmqpService rabbitService;

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendToConsumer(@RequestBody String message) {
        rabbitService.sendToConsumer(new Message(message));
    }

}
