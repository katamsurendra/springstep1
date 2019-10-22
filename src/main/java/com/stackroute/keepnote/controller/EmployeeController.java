package com.stackroute.keepnote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stackroute.keepnote.model.Employee;
import com.stackroute.keepnote.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository erep;
	
	@RequestMapping("/employee/{name}")
	public String welcome( @PathVariable String name, Model model) {
		
		System.out.println(" Inside Welcome Controller "+ name);
		
		model.addAttribute("myname",name);
		
		return "employee";
	}

	
	@RequestMapping("/employee")
	
	public String saveEmployee(Model model) {
		
		Employee emp = new Employee();
		emp.setSalary(50000);
		model.addAttribute("command", emp);
		List<Employee> elis=erep.getAll();
		model.addAttribute("emps", elis);
		
	//	erep.saveEmp(emp);
		return "employee";
	}
	
	
	
	
	@RequestMapping(value="/display",method=RequestMethod.POST)
	public String displayEmployee(  @ModelAttribute Employee emp, Model model ) {
		
		model.addAttribute("data", emp);
		//return "redirect:/employee";
		erep.saveEmp(emp);
		return "display";
		
		
	}
	
	
	
	
}
