package com.example.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.BaseTest;
import com.example.vo.StateInfVo;

public class StateInfServiceTests extends BaseTest {
	@Autowired
	private StateInfService stateInfService;

	@Test
	public void selectByYearTest() throws Exception {
		/* todo : device name 출력에 포함되도록 변경. */
		StateInfVo userList = stateInfService.selectMaxRateByYear(2011);
		// stateInfService.selectMaxRateByYear();
		System.out.println("--userList---");
	}

	@Test
	public void selectByDeviceId() throws Exception {
		/* todo : device name 출력에 포함되도록 변경. */
		StateInfVo user = stateInfService.selectMaxRateByDeviceId(2);
		user = stateInfService.selectMaxRateByDeviceId(0);
		user = stateInfService.selectMaxRateByDeviceId(1);

		System.out.println("--userList---" + user.toString());
	}
}
