package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author E.Parominsky 04/03/2024 12:38
 */
@Component
public class MessageConsumer {

    @JmsListener(destination = "demo")
    public void receiveMessage(String message) {
        System.out.println(message);
    }

}
