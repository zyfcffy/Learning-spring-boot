package com.ffy.learningspringboot.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class KafkaTopicConfiguration {

  @Value("${spring.kafka.topic}")
  private String topic;

}
