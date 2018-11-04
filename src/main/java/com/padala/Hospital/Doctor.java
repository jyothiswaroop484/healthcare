package com.padala.Hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor") 
public class Doctor {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String specilisation;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the specilisation
	 */
	public String getSpecilisation() {
		return specilisation;
	}
	/**
	 * @param specilisation the specilisation to set
	 */
	public void setSpecilisation(String specilisation) {
		this.specilisation = specilisation;
	}

}
