package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.PhoneDAO;


@Service
public class PhoneServiceImpl implements PhoneService{
	
	private PhoneDAO phoneDAO;
	
	@Autowired
	public PhoneServiceImpl(PhoneDAO phoneDAO) {
		this.phoneDAO = phoneDAO;
	}

	@Override
	public String getPhoneNumber(String number) {
	
	return phoneDAO.getPhoneNumberDAO(number);
	
}

	

}
