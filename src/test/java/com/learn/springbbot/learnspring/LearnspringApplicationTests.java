package com.learn.springbbot.learnspring;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariDriverInfo;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnspringApplicationTests {

	@Test
	void contextLoads() {
		
		Address add = new Address();
		Salary sal = new Salary();
		User user = new User(add, sal);
		
		user.printdetails();
	}

}
