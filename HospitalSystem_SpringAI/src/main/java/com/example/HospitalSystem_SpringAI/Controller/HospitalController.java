package com.example.HospitalSystem_SpringAI.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalSystem_SpringAI.Service.HospitalService;
import com.example.HospitalSystem_SpringAI.model.Hospital;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	private final HospitalService service;

	public HospitalController(HospitalService service) {
		this.service = service;
	}

	@GetMapping
	public List<Hospital> getAll() {
		return service.getAllPatient();
	}

	@GetMapping("/{id}")
	public Hospital getOne(@PathVariable Long id) {
		return service.getOnePatient(id);
	}

	@PostMapping
	public Hospital create(@RequestBody Hospital h) {
		return service.createPatient(h);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deletePatient(id);
	}
}
