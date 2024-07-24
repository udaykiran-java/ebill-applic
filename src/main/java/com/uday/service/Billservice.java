package com.uday.service;

import java.util.List;

import com.uday.model.Bill;

public interface Billservice {
	
	public Bill savebill(Bill bill);
	public Bill getonebill(int cid);
	public void deletebill(int cid);
	public Bill updatebill(Bill bill, int cid);
	public List<Bill> allbills();

}
