package looseCoupling;

public class LooseMainClass {

	public static void main(String[] args) {
		UserDataProvider udp = new UserDB();
		UserManager userManager = new UserManager(udp);
		System.out.println(userManager.GetUserManager());
		
		UserDataProvider webProvider = new WebProvider();
		UserManager webUserManager = new UserManager(webProvider);
		System.out.println(webUserManager.GetUserManager());
		
		
	}

}
