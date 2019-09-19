package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DevicesDto;
import com.example.service.DevicesService;
import com.example.vo.DevicesVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DevicesController {

	@Autowired
	DevicesService devicesService;

	/*
	 * 인터넷뱅킹 서비스 접속 기기 목록을 출력하는 API 
	 * */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectList() throws JsonProcessingException {
		List<DevicesDto> devicesList = devicesService.selectAllDevices();

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(devicesList);

		return jsonStr;
	}

	/*
	 * 각 년도별로 인터넷뱅킹을 가장 많이 이용하는 접속기기를 출력하는 API
	 * */
	@RequestMapping(value = "/max", method = RequestMethod.GET)
	public String selectMaxRateByYear() throws JsonProcessingException {
		List<DevicesVo> devicesList = devicesService.selectMaxRate();

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(devicesList);

		return jsonStr;
	}

}
