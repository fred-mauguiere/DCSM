package com.discngine.dcsm.domain;

public class Application {
	private String applicationCode;
	private String label;
	private String description;
	private String applicationUrl;
	private String moreInfoUrl;
	private String isActive;
	private String createdBy;
	private String createdDate;
	private String lastUpdatedBy;
	private String lastUpadatedDate;
	
	public Application() {
		super();
		}
	
	// getters and setters
	public String getApplicationCode() {
		return this.applicationCode;
	}
	
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	
	
	public String getLabel() {
		return this.label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getApplicationUrl() {
		return this.applicationUrl;
	}
	
	public void setApplicationUrl(String applicationUrl) {
		this.applicationUrl = applicationUrl;
	}
	
	
	public String getMoreInfoUrl() {
		return this.moreInfoUrl;
	}
	
	public void setMoreInfoUrl(String moreInfoUrl) {
		this.moreInfoUrl = moreInfoUrl;
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
