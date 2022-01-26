package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
		
	}
	@RequestMapping("/registration")
	public String preregisterdata()
	{
		return"registration";
		
	}
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student s)
	{
		Student st=hs.saveData(s);
		
		if(st!=null)
		{
			
		   return "login";
		
		}
		else 
		{
			return "registration";
		}
	}
	
	@RequestMapping("/login")
	public String logincheck(@RequestParam("uname") String un,@RequestParam("password") String ps, Model m)
	{
		Student id=hs.logincheck(un,ps);
		Iterable<Student>list=hs.displayAll();
		
		if(id!=null)
		{
			m.addAttribute("data" ,list);
			return"success";
		}
		
		else
		{
			return"login";
		}
		
	}
	@RequestMapping("/delete")
	public String DeleteData(@ModelAttribute Student s,Model m)
	{
		hs.DeleteData(s);
		Iterable<Student>list=hs.displayAll();
		m.addAttribute("data",list);
		return "success";
		
	}
	@RequestMapping("/edit")
     public String editData(@RequestParam ("uid") int uid) {
		Student st=hs.editData(uid);
		return "edit";
    	 
     }
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m) {
		Student st=hs.saveData(s);
		Iterable<Student> list=hs.displayAll();
		m.addAttribute("data", list);
		
		
		return "success";
		
		
		
		
	}

	

	
} 