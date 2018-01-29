package com.discngine.dcsm.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.discngine.dcsm.domain.Application;

@Repository
@Transactional(readOnly = true)
public class ApplicationRepositoryImpl implements ApplicationRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Application> getAllApplications() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Application";
		Query<Application> query = session.createQuery(hql);
		List<Application> appList = query.list();
		return appList;
	}
}
