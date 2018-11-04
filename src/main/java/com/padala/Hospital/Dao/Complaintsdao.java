package com.padala.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padala.Hospital.Complaints;
@Repository
public interface Complaintsdao extends JpaRepository<Complaints,Long>{

}
