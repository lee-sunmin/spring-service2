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
@RequestMapping(value = "/devices")
public class DevicesController {

	@Autowired
	DevicesService devicesService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectList() throws JsonProcessingException {
		List<DevicesDto> devicesList = devicesService.selectAllDevices();

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = "";
		jsonStr += mapper.writerWithDefaultPrettyPrinter().writeValueAsString(devicesList);

		return jsonStr;
	}

	@RequestMapping(value = "/max", method = RequestMethod.GET)
	public String selectMaxRateByYear() throws JsonProcessingException {
		List<DevicesVo> devicesList = devicesService.selectMaxRate();

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = "";
		jsonStr += mapper.writerWithDefaultPrettyPrinter().writeValueAsString(devicesList);

		return jsonStr;
	}

}
