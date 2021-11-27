package com.ffy.learningspringboot.service

import org.springframework.kafka.core.KafkaTemplate
import spock.lang.Specification

class ProcessingServiceTest extends Specification {

  def kafkaTemplate = Mock(KafkaTemplate.class)

}
