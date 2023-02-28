package com.employee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.Employee;
import com.employee.repo.EmployeeRepo;



@RestController
@RequestMapping("/EMP")

	public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	@PostMapping(path="/CreateEmployee")
	public Employee addEmployee(@RequestBody Employee employee){
		return repo.save(employee);
	}
	@PutMapping(path="/UpdateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee){
		return repo.save(employee);
	}
	@GetMapping(path="/Employee/{id}")
	public Employee getEmployee(@PathVariable int id){
		Employee e =repo.findById(id).get();
		return e;
	}
	@DeleteMapping(path="/DeleteEmployee/{id}")
	public Employee deleteEmployee(@PathVariable int id){
		Employee e =repo.findById(id).get();
		repo.deleteById(id);
		return e;
		
	}

	}
		
