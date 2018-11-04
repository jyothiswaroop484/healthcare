package com.padala.Hospital;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compliants")
public class Complaints {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(
			name="complaint_disease",
	        joinColumns= {@JoinColumn(name="cid")},
	        inverseJoinColumns={@JoinColumn(name="deid")}
			)
	private List<Disease>  disease;
	private String descripsition;
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting vist;
	@OneToMany(mappedBy="complaints", cascade=CascadeType.ALL)
	private List<Medication> medication;
	/**
	 * @return the medication
	 */
	public List<Medication> getMedication() {
		return medication;
	}
	/**
	 * @param medication the medication to set
	 */
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
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
	 * @return the disease
	 */
	public List<Disease> getDisease() {
		return disease;
	}
	/**
	 * @param disease the disease to set
	 */
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	public String getDescripsition() {
		return descripsition;
	}
	/**
	 * @param descripsition the descripsition to set
	 */
	public void setDescripsition(String descripsition) {
		this.descripsition = descripsition;
	}
	/**
	 * @return the vist
	 */
	public Visiting getVist() {
		return vist;
	}
	/**
	 * @param vist the vist to set
	 */
	public void setVist(Visiting vist) {
		this.vist = vist;
	}

}
