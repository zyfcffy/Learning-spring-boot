package com.ffy.learningspringboot.service;

import com.ffy.learningspringboot.configuration.KafkaTopicConfiguration;
import com.ffy.learningspringboot.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProcessingService {

  private KafkaTemplate<String, UserDto> kafkaTemplate;
  private KafkaTopicConfiguration topicConfiguration;

  public void process(UserDto data) {
    kafkaTemplate.send(topicConfiguration.getTopic(), data);
  }
}
