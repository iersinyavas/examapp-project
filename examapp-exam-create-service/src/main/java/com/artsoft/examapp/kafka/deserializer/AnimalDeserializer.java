package com.artsoft.examapp.kafka.deserializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.artsoft.Animal;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnimalDeserializer implements Deserializer<Animal> {

	  @Override public void close() {

	  }

	  @Override
		public void configure(Map<String, ?> configs, boolean isKey) {
			// TODO Auto-generated method stub
			
		}

	  @Override
	  public Animal deserialize(String arg0, byte[] arg1) {
	    ObjectMapper mapper = new ObjectMapper();
	    Animal animal = null;
	    try {
	      animal = mapper.readValue(arg1, Animal.class);
	    } catch (Exception e) {

	      e.printStackTrace();
	    }
	    return animal;
	  }

	

	}