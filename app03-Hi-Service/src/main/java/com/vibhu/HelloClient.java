package com.vibhu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Hello-Application")
public interface HelloClient {
	@GetMapping(value = "/hello/{name}")
	public String getHello(@PathVariable("name") String name);

}
