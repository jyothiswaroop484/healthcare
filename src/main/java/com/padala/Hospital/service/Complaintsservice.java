package com.padala.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padala.Hospital.Complaints;
import com.padala.Hospital.Medication;
import com.padala.Hospital.Dao.Complaintsdao;

@Service
public class Complaintsservice {
	@Autowired
	private Complaintsdao dao;
public void savellComplaints(List<Complaints> complaint) {

	for (Complaints complaints : complaint) {
		List<Medication> m = complaints.getMedication();
		for (Medication med : m) {
			med.setComplaint(complaints);
		}
	}
	dao.saveAll(complaint);
	
}
}
