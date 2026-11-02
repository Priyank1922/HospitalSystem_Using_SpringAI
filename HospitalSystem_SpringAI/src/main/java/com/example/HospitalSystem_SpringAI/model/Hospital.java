package com.example.HospitalSystem_SpringAI.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pId;

	private String patientName;
	private String pAddress;
	private Integer age;
	private String gender;
	private String disease;
	private String doctor;
	private LocalDate lastVisit;

	public Hospital() {
	}

	public Hospital(Long pId, String patientName, String pAddress, Integer age, String gender, String disease,
			String doctor, LocalDate lastVisit) {
		this.pId = pId;
		this.patientName = patientName;
		this.pAddress = pAddress;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
		this.doctor = doctor;
		this.lastVisit = lastVisit;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public LocalDate getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(LocalDate lastVisit) {
		this.lastVisit = lastVisit;
	}
}