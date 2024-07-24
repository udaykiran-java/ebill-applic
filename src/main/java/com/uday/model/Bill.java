package com.uday.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	private int current_reading;
	private int previous_reading;
	private int units;
	private double service_charge;
	private double totalbill;
	public Bill() {
		super();
	}
	public Bill(int cid, String name, int current_reading, int previous_reading, int units, double service_charge,
			double totalbill) {
		super();
		this.cid = cid;
		this.name = name;
		this.current_reading = current_reading;
		this.previous_reading = previous_reading;
		this.units = units;
		this.service_charge = service_charge;
		this.totalbill = totalbill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(int current_reading) {
		this.current_reading = current_reading;
	}
	public int getPrevious_reading() {
		return previous_reading;
	}
	public void setPrevious_reading(int previous_reading) {
		this.previous_reading = previous_reading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getService_charge() {
		return service_charge;
	}
	public void setService_charge(double service_charge) {
		this.service_charge = service_charge;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	@Override
	public String toString() {
		return "Bill [cid=" + cid + ", name=" + name + ", current_reading=" + current_reading + ", previous_reading="
				+ previous_reading + ", units=" + units + ", service_charge=" + service_charge + ", totalbill="
				+ totalbill + "]";
	}
	
	

}
