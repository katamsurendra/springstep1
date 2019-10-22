package com.stackroute.keepnote.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.Employee;

@Repository
public class EmployeeRepository {
	
	List<Employee> empList;
	
	public EmployeeRepository() {
		empList= new ArrayList<Employee>();
	}
	

	public void saveEmp(Employee emp) {
		empList.add(emp);
		
		
	}
	
	
	public List<Employee> getAll(){
		
		return empList;
	}
	
	
	public boolean isExist(Employee e) {
		
		return empList.contains(e);
		
		//return true;
	}
	
	
	public  void delete(Employee e) {
		empList.remove(e);
	}
	
}
