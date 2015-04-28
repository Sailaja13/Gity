package com.eptent.bookingsoftware;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

public class Event {
	
	@Id private String id;
	
	List<String> eventAttributes;
	Date showDate;
	String venue;
	String showType;
	Address address;

	Date loadIn;
	List<ShowSetTimes> sets;
	
	Boolean confirmed;
	
	List<String> sponsors;
	
	String contactID;
	
	String specialInstructions;
	
	Integer guarantee;
	Integer bookerPercentage;
	
	public List<String> getEventAttributes() {
		return eventAttributes;
	}
	public void setEventAttributes(List<String> eventAttributes) {
		this.eventAttributes = eventAttributes;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLoadIn() {
		return loadIn;
	}
	public void setLoadIn(Date loadIn) {
		this.loadIn = loadIn;
	}
	public List<ShowSetTimes> getSets() {
		return sets;
	}
	public void setSets(List<ShowSetTimes> sets) {
		this.sets = sets;
	}
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	public List<String> getSponsors() {
		return sponsors;
	}
	public void setSponsors(List<String> sponsors) {
		this.sponsors = sponsors;
	}
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public Integer getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(Integer guarantee) {
		this.guarantee = guarantee;
	}
	public Integer getBookerPercentage() {
		return bookerPercentage;
	}
	public void setBookerPercentage(Integer bookerPercentage) {
		this.bookerPercentage = bookerPercentage;
	}
	

}
