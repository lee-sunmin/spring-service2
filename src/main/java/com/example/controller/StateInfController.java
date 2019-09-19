package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StateInfService;
import com.example.vo.StateInfVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class StateInfController {
	@Autowired
	StateInfService stateInfService;

	/*
	 * 특정 년도를 입력받아 그 해에 인터넷뱅킹에 가장 많이 접속하는 기기 이름을 출력하는 API
	 * */
	@RequestMapping(value = "/year/{year}", method = RequestMethod.GET)
	public String selectMaxRateByYear(@PathVariable int year) throws JsonProcessingException {
		StateInfVo StateInfVo = stateInfService.selectMaxRateByYear(year);

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(StateInfVo);

		return jsonStr;
	}

	/*
	 * 디바이스 아이디를 입력받아 인터넷뱅킹에 접속 비율이 가장 많은 해를 출력하는 API
	 * */
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public String selectMaxRateByDeviceId(@PathVariable int id) throws JsonProcessingException {
		StateInfVo StateInfVo = stateInfService.selectMaxRateByDeviceId(id);

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(StateInfVo);

		return jsonStr;
	}
}
