package com.aps.rabbitmqspringboot.amqp;

public interface AmqpProducer<T> {

    void produce(T t);

}
