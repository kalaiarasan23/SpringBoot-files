package com.looseCoupling.ioc;

public class NewDBProvider implements UserDataProvider {

	@Override
	public String getUserDB() {
		return "new DB provider";
	}



}
