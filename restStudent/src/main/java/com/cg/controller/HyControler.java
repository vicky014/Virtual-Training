package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;

@RestController
@RequestMapping("/")
public class HyControler {
	
	List<Student> s=new ArrayList<>();
	
	public HyControler() {
		s.add(new Student("Vikram",11613655));
		s.add(new Student("Saurabh",11614666));
	}
	
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Welcome page!"+name;	
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Student> index(){
		return s;
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "**********Ohayo**********";
	}
	

}
