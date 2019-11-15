package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Service.MyServiceIntf;
import com.model.Query;
import com.model.Register;

@Controller("mycontroller")
public class MyController {
	
	@RequestMapping(path="/hello1", method=RequestMethod.GET)
	public void show1(){
		System.out.println("i am fine");
	}

	@RequestMapping(value="/hello2", method=RequestMethod.GET)
		public String show2(){
			System.out.println("i am fine ..");
			return "show2";
		}
	@RequestMapping(value="/hello3",method=RequestMethod.GET)
	public ModelAndView show3(){
		ModelAndView mav =new ModelAndView();
		mav.setViewName("show3");
		mav.addObject("var1","info");
		mav.addObject("var2","name");
		
		return mav;
		

	}
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String getQueryform(){
		return "query";
		
		
		
	}
	@RequestMapping(value="/makequery",method=RequestMethod.GET)
	public ModelAndView sendQueryform(@ModelAttribute Query query){
		System.out.println(query.getName());
		System.out.println(query.getInfo());
		ModelAndView mav=new ModelAndView("query1");
		mav.addObject("obj",query);
		return  mav;
		
	}
	
	@Autowired
	MyServiceIntf userService;
	@RequestMapping(value="/showusers",method=RequestMethod.GET)
	public ModelAndView ViewUsers(){
		List<Register> list=userService.getUsers();
		ModelAndView mav=new ModelAndView("viewusers");
		mav.addObject("obj",list);
		return  mav;
	}
}
