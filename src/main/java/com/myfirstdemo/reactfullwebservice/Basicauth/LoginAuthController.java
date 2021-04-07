package com.myfirstdemo.reactfullwebservice.Basicauth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginAuthController {
	
	@GetMapping(path="/login-auth")
	public LoginAuthBean loginAuthBean() {

		return new LoginAuthBean("Login successfully");
	}

}
