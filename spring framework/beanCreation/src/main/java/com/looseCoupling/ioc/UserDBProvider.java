package com.looseCoupling.ioc;

public class UserDBProvider implements UserDataProvider {
	
	public String getUserDB(){
		return "user name in UserDB";
	}

}
