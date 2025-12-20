package com.pipeline.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void sampleTest() {
		String str = "Pipeline Integration Test Successful";
		assert(str.equals("Pipeline Integration Test Success"));
	}

}
