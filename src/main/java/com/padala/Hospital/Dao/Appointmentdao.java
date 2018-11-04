package com.padala.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padala.Hospital.Appointment;
@Repository
public interface Appointmentdao extends JpaRepository<Appointment, Integer>{

}
