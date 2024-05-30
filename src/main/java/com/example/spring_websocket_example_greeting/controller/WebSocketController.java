package com.example.spring_websocket_example_greeting.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    
    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public String greeting(String message) {
        return "Hello, " + message + "!";
    }

}
