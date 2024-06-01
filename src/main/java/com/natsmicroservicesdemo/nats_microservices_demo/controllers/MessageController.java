package com.natsmicroservicesdemo.nats_microservices_demo.controllers;

import com.natsmicroservicesdemo.nats_microservices_demo.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message){
        publisherService.publishMessage("connection_updates", message);
        return "Message sent: " + message;
    }

}
