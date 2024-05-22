public class YoutubeProject1Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(YoutubeProject1Application.class, args);
		FirstClass firstClass = new FirstClass();
		firstClass.helloSay();
	}


public class MyFirstClass { // separate class
	void helloSay()
	{
		System.out.println("hello world");
	}
}

}
