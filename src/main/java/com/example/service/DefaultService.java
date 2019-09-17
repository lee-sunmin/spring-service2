package com.example.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DevicesDao;
import com.example.dao.StateInfDao;
import com.example.dto.DevicesDto;
import com.example.dto.StateInfDto;

import java.util.List;

@Service
public class DefaultService {

	@Autowired
	DevicesDao devicesDao;

	@Autowired
	StateInfDao stateInfDao;

	public String upload() throws Exception {

		try {
			File file = new File("src/main/resources/test.csv");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			
			String line = bufReader.readLine();
			String[] base = line.split(",");

			for (int i = 2; i < base.length; i++) {
				DevicesDto devicesDto = new DevicesDto();
				devicesDto.setDevice_name(base[i]);
				devicesDao.save(devicesDto);
			}

			List<DevicesDto> deviceList = devicesDao.findAll();

			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				String[] token = line.split(",");

				int year = Integer.parseInt(token[0]);
				double util = Double.parseDouble((token[1].equals("-")) ? "-1" : token[1]);

				for (int j = 2; j < token.length; j++) {
					int deviceId = 0;
					for (int k = 0; k < deviceList.size(); k++) {
						if (deviceList.get(k).getDevice_name().equals(base[j])) {
							deviceId = deviceList.get(k).getDevice_id();
							break;
						}
					}

					double rate = Double.parseDouble((token[j].equals("-")) ? "-1" : token[j]);

					StateInfDto stateInfDto = new StateInfDto();
					stateInfDto.setYear(year);
					stateInfDto.setDevice(deviceId);
					stateInfDto.setRate(rate);
					stateInfDto.setUtil(util);

					stateInfDao.save(stateInfDto);
				}
				// System.out.println("");
				// List<StateInfDto> List = stateInfDao.findAll();
				// System.out.println("");
			}
			// .readLine()은 끝에 개행문자를 읽지 않는다.
			bufReader.close();
		} catch (Exception e) {

		}
		return "success";
	}
}
