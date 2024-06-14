package com.app.skp.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.skp.binding.CitizenApp;
import com.app.skp.entity.CitizenAppEntity;
import com.app.skp.repo.CitizenRepo;
import com.app.skp.service.CitizenService;

@Service
public class CitizenServiceImpl implements CitizenService{
	
	private String SSA_API_URL="http://192.168.3.1:8080/ssn/{ssn}";
	@Autowired
	private CitizenRepo citizenRepo;
	
	public String createCitizenApp(CitizenApp citizenApp) {
		Long citizenSsn = citizenApp.getCitizenSsn();
		CitizenAppEntity findByCitizenSsn = citizenRepo.findByCitizenSsn(citizenSsn);
		if(findByCitizenSsn!=null) {
			return "Duplicate Application";
		}
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(SSA_API_URL,String.class,citizenSsn);
		String body = forEntity.getBody();
		if(body.equals("Rhode Island")) {
			CitizenAppEntity entity=new CitizenAppEntity();
			BeanUtils.copyProperties(citizenApp, entity);
			CitizenAppEntity save = citizenRepo.save(entity);
			return "Application created with Case Number :"+save.getCaseNum();
		}
		return "Invalid SSN";
	}
	public List<CitizenApp> getCitizenApplication(Integer userId, String userType) {
		
		List<CitizenAppEntity> entities=null;
		List<CitizenApp> citizenApp=new ArrayList<>();
		if("Admin".equals(userType)) {
			entities= citizenRepo.findAll();
		}
		else {
			entities= citizenRepo.findByCreatedBy(userId);
		}
		for(CitizenAppEntity entity:entities) {
			
			CitizenApp app=new CitizenApp();
			BeanUtils.copyProperties(entity,app);
			citizenApp.add(app);
		}
		return citizenApp;
	}
}
