package com.artsoft.examapp.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import com.artsoft.Animal;

public class Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

  @Value("${kafka.topic.json}")
  private String jsonTopic;

  @Autowired
  private KafkaTemplate<String, Animal> kafkaTemplate;

  public void send(Animal animal) {
    LOGGER.info("sending animal='{}'", animal.toString());
    kafkaTemplate.send(jsonTopic, animal);
  }
}