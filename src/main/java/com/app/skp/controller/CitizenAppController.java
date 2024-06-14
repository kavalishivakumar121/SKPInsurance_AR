package com.app.skp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.skp.binding.CitizenApp;
import com.app.skp.service.CitizenService;
@RestController
public class CitizenAppController {

	@Autowired
	private CitizenService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createCitizenApp(@RequestBody CitizenApp citizenApp){
		String createCitizenApp = service.createCitizenApp(citizenApp);
		return new ResponseEntity<String>(createCitizenApp,HttpStatus.OK);
	}
	
	@GetMapping("/citizens/{caseNum}/{createBy}")
	public ResponseEntity<?> getCitizenApplications(@PathVariable Integer caseNum, @PathVariable String createdBy ){
		List<CitizenApp> citizenApplication = service.getCitizenApplication(caseNum, createdBy);
		return new ResponseEntity<List<CitizenApp>>(citizenApplication,HttpStatus.OK);
	}
}
