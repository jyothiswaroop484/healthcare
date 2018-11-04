package com.padala.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padala.Hospital.Complaints;
import com.padala.Hospital.service.Complaintsservice;
@RestController
@RequestMapping("complaints")
public class Complaintscontroller {
	@Autowired
	private Complaintsservice service;
	@PostMapping("/saveCmpl")
public void savellComplaints(@RequestBody List<Complaints> complaint) {
		service.savellComplaints(complaint);
		
}
	
}
