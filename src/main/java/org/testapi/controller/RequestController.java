package org.testapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	
	@GetMapping("/requestSID")
	public String reuestInq () {
		return "Input Request Parameter";
		
	}

}
