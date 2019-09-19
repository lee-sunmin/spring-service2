package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StateInfDao;
import com.example.vo.StateInfVo;

@Service
public class StateInfService {
	@Autowired
	StateInfDao stateInfDao;

	public StateInfVo selectMaxRateByYear(int year) {
		return stateInfDao.selectMaxRateByYear(year);
	}

	public StateInfVo selectMaxRateByDeviceId(int deviceId) {
		return stateInfDao.selectMaxRateByDeviceId(deviceId);
	}
}