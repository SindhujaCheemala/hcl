package com.hcl.employee.services;


import java.util.List;

import com.hcl.employee.dao.EmployeeDAO;
import com.hcl.pojo.Employee;

public class EmpServices {
	
	 public List<Employee> displayEmployeeDetails() {
		 EmployeeDAO dao= new EmployeeDAO();
		return dao.displayEmployee();
	}
     public Employee addEmployee(Employee employee) {
    	 EmployeeDAO dao= new EmployeeDAO();
    	 return dao.addEmployee(employee);
     }
     public Employee deleteEmployee(Employee employee) {
    	 EmployeeDAO dao= new EmployeeDAO();
    	 return dao.deleteEmployee(employee);
     }
     public Employee updateEmployee(Employee employee) {
    	 EmployeeDAO dao= new EmployeeDAO();
    	 return dao.updateEmployee(employee);
     }
     
}
