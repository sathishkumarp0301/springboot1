package com.employee.repo;

import org.springframework.data.repository.CrudRepository;

import com.employee.bean.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee,Integer>{

}


