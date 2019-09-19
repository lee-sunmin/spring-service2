package com.example.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.BaseTest;

public class DevicesControllerTests extends BaseTest {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void createController() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void selectListTest() throws Exception {
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/list").contentType(MediaType.APPLICATION_JSON);
		mockMvc.perform(reqBuilder).andExpect(status().isOk()).andDo(print());
	}

	@Test
	public void selectMaxRateByYearTest() throws Exception {
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/max").contentType(MediaType.APPLICATION_JSON);
		mockMvc.perform(reqBuilder).andExpect(status().isOk()).andDo(print());
	}

}
