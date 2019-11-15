package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Contact;
import com.model.Register;
import com.service.MyServiceIntf;

@Controller("myController")
public class MyController {
	
	@Autowired
	MyServiceIntf myService;
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public ModelAndView insertContact(HttpServletRequest request,HttpServletResponse response){
	String name=request.getParameter("name");
	String info=request.getParameter("info");
	Contact contact=new Contact();
	contact.setName(name);
	contact.setInfo(info);
	
	boolean flag=myService.insertContact(contact);
	ModelAndView mav=new ModelAndView();
	mav.addObject("name",name);
	if(flag)
		mav.addObject("status","message is accecepted");
	else
		mav.addObject("status","sorry.........message is not accecepted");
	mav.setViewName("contactreport");
	return mav;
	
}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ModelAndView insertRegister(HttpServletRequest request,HttpServletResponse response) throws ParseException{
   int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String uname=request.getParameter("uname");
	SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
	Date date=formatter1.parse(request.getParameter("date")); 
	String password=request.getParameter("pwd");
	String contact=request.getParameter("num");
	

	Register reg=new Register();
	reg.setId(id);
	reg.setName(name);
	reg.setUsername(uname);
    reg.setDob(date);
    reg.setPassword(password);
    reg.setContact(contact);
	
	
   
	boolean flag=myService.insertRegister(reg);
	ModelAndView mav=new ModelAndView();
	mav.addObject("name",name);
	if(flag)
		mav.addObject("status","registered successfully");
	else
		mav.addObject("status","sorry......... not accecepted");
	mav.setViewName("regreport");
	return mav;
	}
}


