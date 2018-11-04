package com.padala.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
	@Autowired
	private MedicineDao da;
	@RequestMapping("medicine")
	public void Medicineinfo(@RequestBody Medicine m) {
		da.save(m);
	}

}
