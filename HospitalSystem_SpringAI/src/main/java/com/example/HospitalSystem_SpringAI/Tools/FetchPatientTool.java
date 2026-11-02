package com.example.HospitalSystem_SpringAI.Tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import com.example.HospitalSystem_SpringAI.Service.HospitalService;
import com.example.HospitalSystem_SpringAI.model.Hospital;

@Component
public class FetchPatientTool {

	private final HospitalService fService;

	public FetchPatientTool(HospitalService fService) {
		this.fService = fService;
	}

	@Tool(description = "Fetch patient information from hospital database using patient name")
	public Hospital fetchPatient(String patientName) {
		return fService.getPatientByName(patientName);
	}
}