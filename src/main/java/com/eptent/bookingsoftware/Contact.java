package com.eptent.bookingsoftware;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Contact {

	@Id private String id;

	private String firstName;
	private String lastName;
	private String department;
	private String title;
	private String email;
	private String website;
	private String organizationID;
	private Address address;
	private String notes;
	List<Phone> phones;
	List<String> activities;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}

	public void addActivity(String activity)
	{
		activities.add(activity);
	}
	
	public List<String> getActivities()
	{
		return activities;
	}
	
	public void deleteActivity(String activity)
	{
		activities.remove(activity);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

}

