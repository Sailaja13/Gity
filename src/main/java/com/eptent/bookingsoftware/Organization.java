package com.eptent.bookingsoftware;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Organization {

	@Id private String id;

	private String name;
	private String organizationType;
	private String email;	
	private String programmingBoardEmail;
	private String website;
	private Date springBooking;
	private Date fallBooking;
	private String facebook;
	private String twitter;
	private String parentID;
	
	private Address address;
	private List<Phone> phones;
	private List<String> activities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getSpringBooking() {
		return springBooking;
	}

	public void setSpringBooking(Date springBooking) {
		this.springBooking = springBooking;
	}

	public Date getFallBooking() {
		return fallBooking;
	}

	public void setFallBooking(Date fallBooking) {
		this.fallBooking = fallBooking;
	}

	public String getProgrammingBoardEmail() {
		return programmingBoardEmail;
	}

	public void setProgrammingBoardEmail(String programmingBoardEmail) {
		this.programmingBoardEmail = programmingBoardEmail;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		//this.address.
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	

}

