package com.example.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PhoneDAOImpl implements PhoneDAO {
	
	private RestTemplate restTemplate = new RestTemplate();
	private String apiUrl="http://apilayer.net/api/validate?access_key=b900e3ab8745eb87e779340cbb557181";
	
	@Override
	public String getPhoneNumberDAO(String number) {
		
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("number", number);
		String result = restTemplate.getForObject(apiUrl+"&number={number}", String.class, vars);
		return result;
	}



}
