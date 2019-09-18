package com.example.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.BaseTest;
import com.example.dto.DevicesDto;
import com.example.vo.DevicesVo;

public class DevicesServicesTests extends BaseTest {

	@Autowired
	private DevicesService devicesService;

	@Test
	public void selectMaxRateByYearTest() throws Exception {
		List<DevicesVo> DevicesVo = devicesService.selectMaxRate();
		int i = 0;
		for (; i < DevicesVo.size(); i++) {
			if (DevicesVo.get(i).getYear() == 2011) {
				break;
			}
		}

		assertEquals("데스크탑 컴퓨터", DevicesVo.get(i).getDevice_name());
		assertEquals(95.1, DevicesVo.get(i).getRate(), 0);
	}

	@Test
	public void selectAllDevicesTest() {
		List<DevicesDto> DevicesList = devicesService.selectAllDevices();
		
		assertEquals(5, DevicesList.size(), 0);
	}

}
