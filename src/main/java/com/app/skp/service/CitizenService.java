package com.app.skp.service;

import java.util.List;

import com.app.skp.binding.CitizenApp;

public interface CitizenService {

	public String createCitizenApp(CitizenApp citizenApp);
	public List<CitizenApp> getCitizenApplication(Integer userId,String userType);

}
