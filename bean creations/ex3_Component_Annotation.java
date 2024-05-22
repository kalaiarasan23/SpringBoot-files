@SpringBootApplication
public class YoutubeProject1Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(YoutubeProject1Application.class, args);
		FirstClass firstClass = context.getBean(FirstClass.class);
		firstClass.helloSay();
	}

@Component
public class FirstClass { // separate class
	void helloSay()
	{
		System.out.println("hello world");
	}
}

}
