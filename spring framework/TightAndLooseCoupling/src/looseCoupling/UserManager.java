package looseCoupling;

public class UserManager {
	UserDataProvider udp ;
	
	public UserManager(UserDataProvider udp) {
		this.udp = udp;
	}

	String GetUserManager() {
		return udp.getUserDB(); // Usermanager is depands on UserDB
	}
}
