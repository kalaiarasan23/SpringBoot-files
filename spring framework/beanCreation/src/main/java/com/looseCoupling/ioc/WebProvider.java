package com.looseCoupling.ioc;

public class WebProvider implements UserDataProvider{

	@Override
	public String getUserDB() {
		return "Web data provider";
	}

}
