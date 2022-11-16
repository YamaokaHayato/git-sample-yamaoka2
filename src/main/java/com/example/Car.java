package com.example;

public class Car {
	
	
	private Integer speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + "]";
	}

}
