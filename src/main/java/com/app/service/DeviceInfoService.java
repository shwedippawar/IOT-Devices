package com.app.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.app.repository.DeviceRepository;

@Service
public interface DeviceInfoService {
	
	DeviceRepository findByStatus(String status);
	LocalDate findByTimestamp(String timestamp);
}
