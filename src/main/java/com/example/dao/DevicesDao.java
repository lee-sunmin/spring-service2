package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.dto.DevicesDto;
import com.example.vo.DevicesVo;

@Repository
@Mapper
public interface DevicesDao {
	void insertDevicesDto(DevicesDto devicesDto);

	DevicesDto findByname(String device_name);

	List<DevicesDto> selectAllDevices();

	List<DevicesVo> selectMaxRate();
}
