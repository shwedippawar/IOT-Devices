package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OperativeParameter extends BaseEntity {

	private String rotorSpeed;
	
	private String slack;
	
	private String rootThreshold;
	
	@OneToOne
	
	private DeviceInfo deviceInfo;

	public OperativeParameter(String rotorSpeed, String slack, String rootThreshold) {
		super();
		this.rotorSpeed = rotorSpeed;
		this.slack = slack;
		this.rootThreshold = rootThreshold;
	}

	public String getRotorSpeed() {
		return rotorSpeed;
	}

	public void setRotorSpeed(String rotorSpeed) {
		this.rotorSpeed = rotorSpeed;
	}

	public String getSlack() {
		return slack;
	}

	public void setSlack(String slack) {
		this.slack = slack;
	}

	public String getRootThreshold() {
		return rootThreshold;
	}

	public void setRootThreshold(String rootThreshold) {
		this.rootThreshold = rootThreshold;
	}
	
	
	
}
