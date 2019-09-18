package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.dto.StateInfDto;
import com.example.vo.StateInfVo;

@Repository
@Mapper
public interface StateInfDao {
	void insertStateInfDto(StateInfDto stateInfDto);

	StateInfVo selectMaxRateByYear(int year);

	StateInfVo selectMaxRateByDeviceId(int deviceId);
}
