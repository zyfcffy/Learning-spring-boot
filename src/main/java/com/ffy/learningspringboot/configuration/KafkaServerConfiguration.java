package com.ffy.learningspringboot.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("spring.kafka.bootstrapserver")
public class KafkaServerConfiguration {

  private String bootstrapServer;

}
