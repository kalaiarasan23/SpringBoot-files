package com.example.demo;

import java.util.Objects;

import org.springframework.stereotype.Component;

public class Theater {

	private String msg;
	
	
	@Override
	public String toString() {
		return "{"+
				" msg"+msg+'\''
				+'}';
	}
		// TODO Auto-generated method stub

	Theater(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this==o) return true;
		
		if(o== null || getClass() != o.getClass()) return false;
		
		Theater t = (Theater) o;
		return Objects.equals(msg,t.msg);
		
	}

	public int hashcode()
	{
		return Objects.hash(msg);
	}
}
