package com.example.demo.constructor.injection;

public class Car {
	Specification sp ;

	public Car(Specification sp) {
		this.sp = sp;
	}
	
	void printDetail() {
		System.out.println("car details "+sp.toString());
	}
}
