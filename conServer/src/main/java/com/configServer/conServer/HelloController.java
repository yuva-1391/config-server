package com.configServer.conServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	
	@Value("${name:not found}")
	private String value;
	
	
	@GetMapping("/getMapping")
	public String getMessage(){
		
		return value;
	}

}
