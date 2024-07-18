package project_spring.internship_zealous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InternshipZealousApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipZealousApplication.class, args);
	}

}
