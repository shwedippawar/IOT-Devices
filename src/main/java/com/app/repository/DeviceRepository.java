package com.app.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.DeviceInfo;


@Repository
public interface DeviceRepository extends JpaRepository<DeviceInfo,Integer> {
	
	DeviceInfo findByStatus(String status);
	DeviceInfo findByTimestamp(String timestamp);
	
}
