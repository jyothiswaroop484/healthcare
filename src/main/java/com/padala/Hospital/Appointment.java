package com.padala.Hospital;

import java.util.Date;

import javax.persistence.Entity;          
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class Appointment {
	private Integer aid;
	private Date date;
	private String conformation;
	private Patient pp;
	
	@ManyToOne
	@JoinColumn(name="fkpid")
	public Patient getPp() {
		return pp;
	}
	public void setPp(Patient pp) {
		this.pp = pp;
	}
	@Id
	@GeneratedValue
	public Integer getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the conformation
	 */
	public String getConformation() {
		return conformation;
	}
	/**
	 * @param conformation the conformation to set
	 */
	public void setConformation(String conformation) {
		this.conformation = conformation;
	}

}
