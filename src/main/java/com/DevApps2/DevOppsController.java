package com.DevApps2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DevOppsController {
	@GetMapping(value = "/GetWord")
	public String getWord() {
		return "Hello Sam";
	}

}
