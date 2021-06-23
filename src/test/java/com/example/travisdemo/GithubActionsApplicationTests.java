package com.example.travisdemo;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubActionsApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void contextLoadsfail() {
		fail();
	}

}
