package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.StateInfDao;
import com.example.dto.StateInfDto;

@Service
@Transactional
public class StateInfService {
	@Autowired
    StateInfDao stateInfDao;
	
	public List<StateInfDto> selectMaxRateByYear() {
		return stateInfDao.selectMaxRateByYear();
	}
}
