package com.example.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.BaseTest;
import com.example.dto.StateInfDto;

public class StateInfServiceTests extends BaseTest {
	@Autowired
	private StateInfService stateInfService;

	@Test
	public void dynamicDataSourceTest() throws Exception {
		 List<StateInfDto> userList = stateInfService.selectMaxRateByYear();
		//stateInfService.selectMaxRateByYear();
		 System.out.println("--userList---" + userList.size());
	}
}
