package com.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.challenge.entity"})
>>>>>>> 0d43a5304b39842ddf42c337a967d951653114c1
public class SpringChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChallengeApplication.class, args);
	}

}
