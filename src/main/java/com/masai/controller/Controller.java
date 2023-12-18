package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@PostMapping("/post")
	public ResponseEntity<String> respo(){
		return new ResponseEntity<String>("Done",HttpStatus.OK) ;
	}
}
