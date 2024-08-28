package tightCoupling;

public class UserManager {
	  UserDB userDB = new UserDB();
	String GetUserManager() {
		return userDB.getUsername(); // Usermanager is depands on UserDB
	}
}
