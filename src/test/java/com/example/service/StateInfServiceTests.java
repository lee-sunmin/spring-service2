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
	public void selectMaxRateByYearTest() throws Exception {
		List<StateInfDto> userList = stateInfService.selectMaxRateByYear();
		// stateInfService.selectMaxRateByYear();
		System.out.println("--userList---" + userList.size());
	}

	@Test
	public void selectByYearTest() throws Exception {
		/* todo : device name 출력에 포함되도록 변경. */
		List<StateInfDto> userList = stateInfService.selectByYear(2011);
		// stateInfService.selectMaxRateByYear();
		System.out.println("--userList---" + userList.size());
	}

	@Test
	public void selectByDeviceId() throws Exception {
		/* todo : device name 출력에 포함되도록 변경. */
		StateInfDto user = stateInfService.selectByDeviceId(3);
		System.out.println("--userList---" + user.toString());
	}
}
