package com.app.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repository.DeviceRepository;

public class DeviceInfoImplement implements DeviceInfoService{

	@Autowired
	private DeviceRepository deviceRepo;
	
	@Override
	public DeviceRepository findByStatus(String status) {
	
		return deviceRepo.findByStatus(status);
	}

	@Override
	public LocalDate findByTimestamp(String timestamp) {
		// TODO Auto-generated method stub
		return null;
	}



}
