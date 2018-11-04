package com.padala.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padala.Hospital.Visiting;
@Repository
public interface visitingdao extends JpaRepository<Visiting, Integer>{

}
