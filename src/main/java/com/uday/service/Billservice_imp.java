package com.uday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uday.model.Bill;
import com.uday.repo.Billrepo;

@Service
public class Billservice_imp implements Billservice {

	
	@Autowired
	private Billrepo repo;
	
	@Override
	public Bill savebill(Bill bill) {
		int u=bill.getCurrent_reading()-bill.getPrevious_reading();
		double sc=120.00;
		double tot=0.0;
		if(u<300) {
			tot=u*1.75;
		}
		else if(u>=300&&u<500) {
			tot=u*3.75;
		}
		else {
			tot=u*7.25;
		}
		bill.setUnits(u);
		bill.setService_charge(sc);
		bill.setTotalbill(tot);
		Bill save=repo.save(bill);
		return save;
	}

	@Override
	public Bill getonebill(int cid) {
		
		return repo.findById(cid).get();
	}

	@Override
	public void deletebill(int cid) {
		repo.deleteById(cid);
	}

	

	@Override
	public List<Bill> allbills() {
		
		List<Bill> all=repo.findAll();
		return all;
	}

	@Override
	public Bill updatebill(Bill bill, int cid) {
		
		Bill up=repo.findById(cid).get();
		up.setCurrent_reading(bill.getCurrent_reading());
		up.setPrevious_reading(bill.getPrevious_reading());
		up.setName(bill.getName());
	    Bill eb=savebill(up);
		return eb;
	}

}
