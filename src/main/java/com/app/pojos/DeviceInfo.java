package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DeviceInfo extends BaseEntity {
	
	private LocalDate timestamp;
	
	private String status;
	
	@OneToOne
	@JoinColumn(name="operativeParameter_id")
	private OperativeParameter operatingParams;
	
	@OneToOne
	@JoinColumn(name="asset_id")
	private AssetObject asset;

	@OneToOne
	@JoinColumn(name="parent_id")
	private Parent parent;

	public DeviceInfo(LocalDate timestamp, String status, OperativeParameter operatingParams, AssetObject asset,
			Parent parent) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.operatingParams = operatingParams;
		this.asset = asset;
		this.parent = parent;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OperativeParameter getOperatingParams() {
		return operatingParams;
	}

	public void setOperatingParams(OperativeParameter operatingParams) {
		this.operatingParams = operatingParams;
	}

	public AssetObject getAsset() {
		return asset;
	}

	public void setAsset(AssetObject asset) {
		this.asset = asset;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	
	
	
	
}
