package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@RequestMapping(method= RequestMethod.GET, path="/add")
	public int add(int firstNum, int secondNum) {
		return firstNum + secondNum;
		
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/subtract")
	public int subtract(int firstNum, int secondNum) {
		return firstNum - secondNum;
		
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/multiply")
	public int multiply(int firstNum, int secondNum) {
		return firstNum * secondNum;
		
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/divide")
	public int divide(int firstNum, int secondNum) {
		return firstNum / secondNum;
		
	}
}
