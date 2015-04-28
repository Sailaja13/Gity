package com.eptent.bookingsoftware;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Schedule {

@Id private String id;

private String name;
private Date start;
private Date end;

	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getStart() {
	return start;
}
public void setStart(Date start) {
	this.start = start;
}
public Date getEnd() {
	return end;
}
public void setEnd(Date end) {
	this.end = end;
}

	

}