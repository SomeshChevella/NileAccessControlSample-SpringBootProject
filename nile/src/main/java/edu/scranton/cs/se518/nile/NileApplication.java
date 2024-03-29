package edu.scranton.cs.se518.nile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class,
		SecurityFilterAutoConfiguration.class
})
public class NileApplication {

	public static void main(String[] arguments) {
		SpringApplication.run(NileApplication.class, arguments);
	}

}
