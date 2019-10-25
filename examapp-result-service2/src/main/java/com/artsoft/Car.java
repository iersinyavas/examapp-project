package com.artsoft;

public class Car {
	Integer id;
	String carName;
	public Car() {}
	
	
	public Car(Integer id, String carName) {
		this.id = id;
		this.carName = carName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
