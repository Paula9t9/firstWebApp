package com.fedyr.code401.firstWebApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FirstWebAppApplicationTests {

	@Autowired
	FirstAppController firstAppController;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testControllerIsAutowired() {
		assertNotNull(firstAppController);
	}

	@Test
	public void testRequestToRootGivesHelloWorld() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(content().string(
				containsString("Hello, world.")));
	}

	@Test
	public void testCapitalize() throws Exception{
		mockMvc.perform(get("capitalize/word")).andExpect(content().string(containsString("WORD")));
	}

	@Test
	public void testReverse() throws Exception{
		mockMvc.perform(get("/reverse?sentence=Hello"))
				.andExpect(content().string(containsString(" olleH")));
	}
}
