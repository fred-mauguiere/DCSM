package com.discngine.dcsm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.discngine.dcsm.domain.Application;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository{
	@Autowired
	private DataSource dataSource;
	
	@Override
	public Application getApplicationById() {
		Application application = null;
		return application;
	}
}
