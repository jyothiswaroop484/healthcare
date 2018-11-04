package com.padala.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	@Autowired
	private PatientDao patientdao;
	@RequestMapping("patientinfo")
	public void Patientinfo(@RequestBody Patient p) {
		
	patientdao.save(p);
		
	}

}
