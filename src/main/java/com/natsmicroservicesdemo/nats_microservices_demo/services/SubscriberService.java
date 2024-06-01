package com.natsmicroservicesdemo.nats_microservices_demo.services;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    @Autowired
    private Connection natsConnection;

    @PostConstruct
    public void subscribeToSubject(){
        Dispatcher dispatcher = natsConnection.createDispatcher(msg -> {
            String response = new String(msg.getData());
            System.out.println("Received message on '" + msg.getSubject() + "': " + response);
        });
        dispatcher.subscribe("connection_updates");
    }
}
