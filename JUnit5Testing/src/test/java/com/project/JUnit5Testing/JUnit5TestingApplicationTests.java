package com.project.JUnit5Testing;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Order(1)
@SpringBootTest
class JUnit5TestingApplicationTests {

	@Test
	void contextLoads() {
	}

}
