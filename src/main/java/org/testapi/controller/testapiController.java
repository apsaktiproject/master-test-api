package org.testapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testapiController {
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String welcome () {
		return "welcome to hell";
	}

}
