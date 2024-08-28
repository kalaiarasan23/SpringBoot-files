package com.example.autowire.type;

public class Car {
	Specification sp ;

	public void setSp(Specification sp) {
		this.sp = sp;
	}

	void printDetail() {
		System.out.println("By Type car details "+sp.toString());
	}

}
