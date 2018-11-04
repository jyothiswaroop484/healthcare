package com.padala.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@Autowired
	private DoctorDao dao;
	@RequestMapping("doctorinfo")
	public void Doctorinfo(@RequestBody Doctor d) {
		dao.save(d);
	}

}
