package com.uday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uday.model.Bill;
import com.uday.service.Billservice;

@RestController
@CrossOrigin(origins = {"*"})
public class Billcontroller {
	
	
	@Autowired
	private Billservice service;
	
	@PostMapping("/save")
	public String savebilldata(@RequestBody Bill bill) {
		
		Bill data= service.savebill(bill);
		String message=null;
		if(data !=null) {
			
			message="data saved successfully";

		}
		else {
			message="data not saved";
		}
		return message;
	}
	@GetMapping("/getone/{cid}")
    public Bill getconsumer(@PathVariable int cid) {
		
		return service.getonebill(cid);
	}
	@DeleteMapping("/delete/{cid}")
    public void deletebill(@PathVariable int cid) {
		
		service.deletebill(cid);
	}
	@GetMapping("/getall")
	public List<Bill> allbills(){
		
		return service.allbills();
	}
	@PutMapping("/update/{cid}")
	public Bill updatebill(@RequestBody Bill bill,@PathVariable int cid,ModelMap model) {
		
		Bill b=service.updatebill(bill,cid);	
		
		return b;
	}
}
