package com.padala.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padala.Hospital.Appointment;
import com.padala.Hospital.Dao.Appointmentdao;

@Service
public class Appointmentservice {
	@Autowired 
	private Appointmentdao dao;

	public void saveallAppointments(List<Appointment>app) {
dao.saveAll(app);
}
}