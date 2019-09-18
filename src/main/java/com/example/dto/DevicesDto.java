package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Devices")
public class DevicesDto {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public int getDevice_id() {
		return id;
	}

	public void setDevice_id(int id) {
		this.id = id;
	}

	public String getDevice_name() {
		return name;
	}

	public void setDevice_name(String name) {
		this.name = name;
	}
}
