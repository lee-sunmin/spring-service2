package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.BaseTest;
import com.example.service.DevicesService;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(DevicesController.class)
public class DevicesControllerTests extends BaseTest {

	@Mock
	private DevicesService localGovernmentSupportService;
	@InjectMocks
	public DevicesController homeController;
	private MockMvc mockMvc;

	@Before
	public void createController() {
		mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
	}

	@Test
	public void restTest() throws Exception {
//		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/devices/list")
//				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		// mockMvc.perform(reqBuilder).andExpect(status().isOk()).andDo(print());
		JSONObject jsonObject = new JSONObject();

		mockMvc.perform(get("/devices/list").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.content(jsonObject.toString().getBytes())).andDo(print()).andExpect(status().is2xxSuccessful());
	}

}
