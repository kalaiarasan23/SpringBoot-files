// three separate classes
@SpringBootApplication
public class YoutubeProject1Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(YoutubeProject1Application.class, args);
		
		FirstClass myFirstClass = ctx.getBean(FirstClass.class);
		myFirstClass.helloSay();
	}
}

public class MyFirstClass {
	void helloSay()
	{
		System.out.println("hello world");
	}
}

@Configuration
public class DemoConfig {
	
	@Bean
	public MyFirstClass myFirstClass() {
		return new MyFirstClass();
	}
}
