package com.padala.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padala.Hospital.Visiting;
import com.padala.Hospital.service.visitingservice;

@RestController
@RequestMapping("Visiting")
public class Visitngcontroller {
	@Autowired
	private visitingservice service;
	@PostMapping("/all")
	public void saveAllVisitings(@RequestBody List<Visiting> vists) {
		service.saveAllVisitings(vists);
	}

}
