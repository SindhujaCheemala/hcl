package com.hcl.pojo;

public class Employee {
	private int Id;
	private String EmpName;
	private String Department;
	private  float Salary ;
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", EmpName=" + EmpName + ", Department=" + Department + ", Salary=" + Salary
				+ "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}

}
