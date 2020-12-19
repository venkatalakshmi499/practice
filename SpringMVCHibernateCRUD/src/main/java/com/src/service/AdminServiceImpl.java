package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.AdminDAO;

import com.src.model.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminServiceI {

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public boolean validate(Admin admin) {
		
		return adminDAO.validate(admin);
	}

}
