package com.discngine.dcsm.domain;

public class Plan {
	private String planId;
	private String applicationCode;
	private String isFreeTrial;
	private String isActive;
	private String createdBy;
	private String createdDate;
	private String lastUpdatedBy;
	private String lastUpadatedDate;
	
	public Plan() {
		super();
		}
	
	// getters and setters
	public String getPlanId() {
		return this.planId;
	}
	
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
	
	public String getApplicationCode() {
		return this.applicationCode;
	}
	
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	
	
	public String getIsFreeTrial() {
		return this.isFreeTrial;
	}
	
	public void setIsFreeTrial(String isFreeTrial) {
		this.isFreeTrial = isFreeTrial;
	}
	
	
	public String getIsActive() {
		return this.isActive;
	}
	
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	public String getCreatedBy() {
		return this.createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	public String getCreatedDate() {
		return this.createdDate;
	}
	
	public void setlastUpdatedBy(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	
	public String getLastUpadatedDate() {
		return this.lastUpadatedDate;
	}
	
	public void setLastUpadatedDate(String lastUpadatedDate) {
		this.lastUpadatedDate = lastUpadatedDate;
	}
}
