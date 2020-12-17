package com.src.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "FLIGHT_LIST")
public class Flights implements Serializable{
	
	private static final long serialVersionUID = -3465813074586302847L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightID;
	
	@Column
	private String flightName;
	
	@Column
	private String source;
	
	@Column
	private String destination;
	
	@Column
	private Date startDateTime;
	
	@Column
	private Date endDateTime;
	
	@Column
	private float price;
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
