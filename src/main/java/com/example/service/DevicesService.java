package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DevicesDao;
import com.example.dto.DevicesDto;
import com.example.vo.DevicesVo;

@Service
public class DevicesService {

	@Autowired
	DevicesDao devicesDao;

	public List<DevicesDto> selectAllDevices() {
		List<DevicesDto> devicesList = devicesDao.selectAllDevices();
		return devicesList;
	}

	public List<DevicesVo> selectMaxRate() {
		return devicesDao.selectMaxRate();
	}

}
