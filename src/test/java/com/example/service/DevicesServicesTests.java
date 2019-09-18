package com.example.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.BaseTest;
import com.example.vo.DevicesVo;

public class DevicesServicesTests extends BaseTest {

	@Autowired
	private DevicesService devicesService;

	@Test
	public void selectMaxRateByYearTest() throws Exception {
		List<DevicesVo> userList = devicesService.selectMaxRate();
		// stateInfService.selectMaxRateByYear();
		System.out.println("--userList---" + userList.size());
	}
}
