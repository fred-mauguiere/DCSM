package com.discngine.dcsm.repository;

import java.util.List;
import com.discngine.dcsm.domain.Application;

public interface ApplicationRepository {
	
	/**
	 * Get all applications
	 * @return a list of all applications
	 */
	public List<Application> getAllApplications();
}
