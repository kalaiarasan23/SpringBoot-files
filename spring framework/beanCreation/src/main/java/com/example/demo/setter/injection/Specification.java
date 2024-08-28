package com.example.demo.setter.injection;

public class Specification {

	String make,model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Spec [make=" + make + ", model=" + model + "]\n";
	}

}
