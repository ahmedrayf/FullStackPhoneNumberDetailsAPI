package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HistoryDAO;
import com.example.demo.entity.Phone;

@Service
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	private HistoryDAO historyDAO;

	@Override
	public List<Phone> getRequestsHistory() {
		
		return historyDAO.findAll();
	}

	@Override
	public Phone saveNumber(Phone phone) {
		return historyDAO.save(phone);
		
	}
	
	

}
