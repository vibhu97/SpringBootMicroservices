package com.vibhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private HelloClient hc;
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable("name") String name) {
		return "Hi "+hc.getHello(name);
	}

}
