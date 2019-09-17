package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.dto.StateInfDto;

@Repository
@Mapper
public interface StateInfDao {
	void insertStateInfDto(StateInfDto stateInfDto);

	List<StateInfDto> selectMaxRateByYear();

	List<StateInfDto> selectByYear(int year);

	StateInfDto selectByDeviceId(int deviceId);
}
