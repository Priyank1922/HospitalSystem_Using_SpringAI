package com.example.HospitalSystem_SpringAI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalSystem_SpringAI.Repository.HospitalRepository;
import com.example.HospitalSystem_SpringAI.model.Hospital;

@Service
public class HospitalService {
	@Autowired
	HospitalRepository repo;

	public List<Hospital> getAllPatient() {
		return repo.findAll();
	}

	public Hospital getOnePatient(long id) {
		return repo.findById(id).orElseThrow();
	}

	public Hospital createPatient(Hospital h) {
		return repo.save(h);
	}

	public void deletePatient(Long id) {
		repo.deleteById(id);
	}

	public Hospital getPatientByName(String patientName) {
		return repo.findByPatientName(patientName);
	}
}
