package com.discngine.dcsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discngine.dcsm.domain.Application;
import com.discngine.dcsm.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Override
	public List<Application> getAllApplications() {
		List<Application> appList = applicationRepository.getAllApplications();
		return appList;
	}

}
