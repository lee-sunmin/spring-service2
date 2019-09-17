package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StateInfDao;
import com.example.dto.StateInfDto;

@Service
public class StateInfService {
	@Autowired
	StateInfDao stateInfDao;

	public List<StateInfDto> selectMaxRateByYear() {
		return stateInfDao.selectMaxRateByYear();
	}

	public List<StateInfDto> selectByYear(int year) {
		return stateInfDao.selectByYear(year);
	}

	public StateInfDto selectByDeviceId(int deviceId) {
		return stateInfDao.selectByDeviceId(deviceId);
	}
}
