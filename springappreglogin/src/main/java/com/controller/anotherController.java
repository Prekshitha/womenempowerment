package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class anotherController {
	
	@Controller("mycontroller")
	public class MyController {
		
		@RequestMapping(path="/hello1", method=RequestMethod.GET)
		public void show1(){
			System.out.println("i am fine");
		}

	}


}
