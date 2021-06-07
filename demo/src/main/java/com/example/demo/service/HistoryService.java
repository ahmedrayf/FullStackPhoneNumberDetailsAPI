package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Phone;



public interface HistoryService  {

	List<Phone> getRequestsHistory();

	Phone saveNumber(Phone phone);

	
}
