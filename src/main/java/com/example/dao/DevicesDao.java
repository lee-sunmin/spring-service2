package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.dto.DevicesDto;

@Repository
@Mapper
public interface DevicesDao {
	void insertDevicesDto(DevicesDto devicesDto);
	DevicesDto findByname(String device_name);
	List<DevicesDto> selectAll();
}
