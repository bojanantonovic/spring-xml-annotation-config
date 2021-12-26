import demo.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String... args) {
		try (final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml")) {
			final B b = context.getBean(B.class);
			System.out.println(b);
			System.out.println(b.a);
			System.out.println(b.fooService.greeting());
		}
	}
}
