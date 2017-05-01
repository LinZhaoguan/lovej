package com.lovej;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testHello() throws Exception {
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.ALL))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"))
				.andReturn();
		System.out.println(mvcResult.getResponse().getContentAsString());
	}

}
