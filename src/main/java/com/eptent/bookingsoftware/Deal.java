package com.eptent.bookingsoftware;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Deal {
	
	@Id private String id;
	
	private Date date; //created date
	private String dealStatusID;
	private String dealWarmthLevel;
	private String contactID;
	private String organizationID;
	private String userID; //Assigned to
	private String notes;
	private Date expectedCloseDate;
	private String pipelineStageID;
	private String pipelineType; //Booking, Sponsorship, Press
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDealStatusID() {
		return dealStatusID;
	}
	public void setDealStatusID(String dealStatusID) {
		this.dealStatusID = dealStatusID;
	}
	public String getDealWarmthLevel() {
		return dealWarmthLevel;
	}
	public void setDealWarmth(String dealWarmthLevel) {
		this.dealWarmthLevel = dealWarmthLevel;
	}
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public String getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Date getExpectedCloseDate() {
		return expectedCloseDate;
	}
	public void setExpectedCloseDate(Date expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}
	public String getPipelineStageID() {
		return pipelineStageID;
	}
	public void setPipelineStageID(String pipelineStageID) {
		this.pipelineStageID = pipelineStageID;
	}
	public String getPipelineType() {
		return pipelineType;
	}
	public void setPipelineType(String pipelineType) {
		this.pipelineType = pipelineType;
	}

}
