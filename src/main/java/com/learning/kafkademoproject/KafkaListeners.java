package com.learning.kafkademoproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkatopic", groupId = "anyNameCanBeGivenHere")
    void listner(String data) {
        System.out.println("Listener received: " + data + " 🤩");
    }
}
