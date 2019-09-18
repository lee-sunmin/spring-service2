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

	@RequestMapping(value = "/year/{year}", method = RequestMethod.GET)
	public String selectMaxRateByYear(@PathVariable int year) throws JsonProcessingException {
		StateInfVo StateInfVo = stateInfService.selectMaxRateByYear(year);

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = "";
		jsonStr += mapper.writerWithDefaultPrettyPrinter().writeValueAsString(StateInfVo);

		return jsonStr;
	}

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public String selectMaxRateByDeviceId(@PathVariable int id) throws JsonProcessingException {
		StateInfVo StateInfVo = stateInfService.selectMaxRateByDeviceId(id);

		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = "";
		jsonStr += mapper.writerWithDefaultPrettyPrinter().writeValueAsString(StateInfVo);

		return jsonStr;
	}
}
