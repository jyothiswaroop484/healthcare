package com.padala.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseDao d;
	@RequestMapping("diseaseinfo")
	public void Diseaseinfo(@RequestBody Disease di) {
		d.save(di);
	}

}
