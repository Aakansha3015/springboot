package Staff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController			//use to create a controller for rest APIs
public class MainController 
{
	@GetMapping("/home") 					//It maps the http get request on specific handler method
	public String getData()
	{
		return "Welcome to the page..";
	}
	
	@GetMapping("/About us")
	public String AboutUs()
	{
		return "Contact us...";
	}
}
