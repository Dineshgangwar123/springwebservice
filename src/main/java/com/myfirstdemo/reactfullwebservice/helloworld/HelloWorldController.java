package com.myfirstdemo.reactfullwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

//	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {

//		throw new RuntimeException("something went wrong");
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path="/hello-world-keyid/{name}")
	public HelloWorldBean Hellowordkeyid(@PathVariable String name)
	{	
		return new HelloWorldBean(String.format("Hello Mr. ,%s",name));
	}
}
