package com.net;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	// Simple Method
	//URI - /helloworld
	//GET
	
	//@RequestMapping(method= RequestMethod.GET, path= "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld()
	{
		return "Hello World1";
	}
	
	@GetMapping("/helloWorld-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Dhvani","Shah","Mumbai");
	}

}
