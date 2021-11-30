package com.ffy.learningspringboot.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerListener {

  @KafkaListener(topics = "${spring.kafka.topic}", groupId = "guest")
  public void listenGroupFoo(String message) {
    log.info("Received Message in group guest: " + message);
  }
}
