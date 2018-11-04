package com.padala.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padala.Hospital.Visiting;
import com.padala.Hospital.Dao.visitingdao;

@Service
public class visitingservice {
	@Autowired
	private visitingdao dao;
	public void saveAllVisitings(List<Visiting> vists) {
		dao.saveAll(vists);
	}

}
