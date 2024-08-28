package com.example.autowire.constructor;

public class Car {
	Specification sp ;

	public void setSp(Specification sp) {
		this.sp = sp;
	}

	void printDetail() {
		System.out.println("car details "+sp.toString());
	}

}
