package com.padala.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padala.Hospital.Appointment;
import com.padala.Hospital.service.Appointmentservice;
@RestController
@RequestMapping("Appointment")
public class Appointmentcontroller {
	@Autowired
	private Appointmentservice ser;
@PostMapping("/all")
	public void saveallAppointments(@RequestBody List<Appointment>app) {
	ser.saveallAppointments(app);

}}
