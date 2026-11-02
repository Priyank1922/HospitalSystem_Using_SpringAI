package com.example.HospitalSystem_SpringAI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HospitalSystem_SpringAI.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
	Hospital findByPatientName(String patientName);
}
