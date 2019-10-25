package com.artsoft.examapp.kafka.config.consumer;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import com.artsoft.Animal;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}

	Animal animal = null;

	@KafkaListener(topics = "${kafka.topic.json}")
	public void receive(Animal animal) {
		LOGGER.info("received animal='{}'", animal.toString());
		this.setAnimal(animal);
		latch.countDown();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}