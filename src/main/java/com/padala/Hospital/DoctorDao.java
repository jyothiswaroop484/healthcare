package com.padala.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
