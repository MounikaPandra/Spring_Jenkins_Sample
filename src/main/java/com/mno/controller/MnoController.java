package com.mno.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MnoController {
	
	@PostMapping("/doRecharge")
	public ResponseEntity<String> doRecharge() {
		return new ResponseEntity<>("Recharge success",HttpStatus.OK);
	}
}
