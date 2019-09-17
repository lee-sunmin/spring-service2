package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "StateInf")
public class StateInfDto {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "year")
	private int year;

	// @ManyToOne
	// @JoinColumn(name = "Devices_device_id")
	@Column(name = "device")
	private int device;

	@Column(name = "rate", columnDefinition = "NUMBER(5,2)")
	// private double rate;
	private double rate;

	@Column(name = "util")
	private double util;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDevice() {
		return device;
	}

	public void setDevice(int device) {
		this.device = device;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getUtil() {
		return util;
	}

	public void setUtil(double util) {
		this.util = util;
	}

}
