package com.natsmicroservicesdemo.nats_microservices_demo.services;

import io.nats.client.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    private Connection natsConnection;

    public void publishMessage(String subject, String message){
        natsConnection.publish(subject, message.getBytes());
    }
}
