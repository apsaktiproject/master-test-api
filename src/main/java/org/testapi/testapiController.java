package org.testapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testapiController {
	
	@RequestMapping("/greeting")
	public String welcome () {
		return "welcome to hell";
	}

}
