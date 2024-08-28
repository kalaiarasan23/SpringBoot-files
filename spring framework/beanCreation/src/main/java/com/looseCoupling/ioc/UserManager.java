package com.looseCoupling.ioc;

public class UserManager {
	UserDataProvider udp ;
	
	public UserManager(UserDataProvider udp) {
		this.udp = udp;
	}
	

	String getUserManager() {
		return udp.getUserDB(); // Usermanager is depands on UserDB
	}
}
