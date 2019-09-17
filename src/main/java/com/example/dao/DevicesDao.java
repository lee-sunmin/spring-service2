package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.DevicesDto;

public interface DevicesDao extends JpaRepository<DevicesDto, Long> {

	// DevicesDto findBydeviceId(String deviceId);
	DevicesDto findByname(String device_name);
	// DevicesDao getDeviceNameByDeviceId(String device_id);
}
