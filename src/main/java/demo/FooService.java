package demo;

import org.springframework.stereotype.Service;

@Service
public class FooService {

	public String greeting() {
		return "Hello World!";
	}
}
