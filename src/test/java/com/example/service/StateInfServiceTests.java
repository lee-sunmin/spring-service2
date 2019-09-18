package com.example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.BaseTest;
import com.example.vo.StateInfVo;

public class StateInfServiceTests extends BaseTest {
	@Autowired
	private StateInfService stateInfService;

	@Test
	public void selectByYearTest() throws Exception {
		StateInfVo stateInfVo = stateInfService.selectMaxRateByYear(2011);
		assertEquals("데스크탑 컴퓨터", stateInfVo.getDevice_name());
		assertEquals(95.1, stateInfVo.getRate(), 0);
	}

	@Test
	public void selectByDeviceId() throws Exception {
		StateInfVo stateInfVo = stateInfService.selectMaxRateByDeviceId(1000);

		assertEquals("스마트폰", stateInfVo.getDevice_name());
		assertEquals(2017, stateInfVo.getYear(), 0);
		assertEquals(90.6, stateInfVo.getRate(), 0);
	}
}
