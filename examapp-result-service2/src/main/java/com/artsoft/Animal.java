package com.artsoft;

public class Animal {
	Integer id;
	String animalName;
	public Animal() {}
	
	
	public Animal(Integer id, String animalName) {
		this.id = id;
		this.animalName = animalName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
}
