package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Phone;
import com.example.demo.service.PhoneService;
import com.example.demo.service.HistoryService;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	private PhoneService phoneService;
	
	@Autowired
	private HistoryService historyService;
	
	public Controller() {}

	@GetMapping("/number")
	public ResponseEntity<List<Phone>>  getHistory(){
		List<Phone> history = historyService.getRequestsHistory();
		return new ResponseEntity<>(history,HttpStatus.OK) ;
	}
	
	@GetMapping("/number/{num}")
	public ResponseEntity<String> getPhoneNumber(@PathVariable("num") String num) {
		String number =  phoneService.getPhoneNumber(num);
		return new ResponseEntity<>(number,HttpStatus.OK) ;	
	}
	
	@PostMapping("/addNumber")
	public ResponseEntity<Phone> savePhoneNumber(@RequestBody Phone phone) {
	Phone addPhone = historyService.saveNumber(phone);
	return new ResponseEntity<>(addPhone,HttpStatus.CREATED);
	}
	

	
	
	
	
	
}
