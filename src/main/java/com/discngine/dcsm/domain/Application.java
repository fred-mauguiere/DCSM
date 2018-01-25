package com.discngine.dcsm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "DC_APPLICATION")
public class Application {
	
	@Id
	@Column(name = "APPLICATION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generated by Oracle (should be on trigger)
	private Integer id;
	
	@Column(name = "LABEL")
	private String label;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "APP_URL")
	private String applicationUrl;
	
	@Column(name = "MORE_INFO_URL")
	private String moreInfoUrl;
	
	@Column(name = "IS_ACTIVE")
	private String isActive;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_DATE")
	private String createdDate;
	
	@Column(name = "LAST_UPDATE_BY")
	private String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATE_DATE")
	private String lastUpadatedDate;
	
	public Application() {
		super();
		}
	
	// getters and setters
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
