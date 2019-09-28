package com.configServer.conServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/getMapping")
	public String getMessage(){
		
		return "its hitting";
	}

}
