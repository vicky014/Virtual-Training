package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Kitchen {
	
	@RequestMapping("/")
	public String chef1()
	{
		return "home.jsp";
	}
    @RequestMapping("userlogin")
	public String chef2()
	{
		return "login.jsp";
	}
    
    @RequestMapping("validateuser")
    public String chef3(@RequestParam String user,int age)
    {
    	if(age>18)
    	{
    		return "welcome.jsp";
    	}
    	else
    	{
    		return "login.jsp";
    	}
    }
}
