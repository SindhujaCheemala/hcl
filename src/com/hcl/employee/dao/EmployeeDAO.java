package com.hcl.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hcl.connection.DBConnection;
import com.hcl.pojo.Employee;

public class EmployeeDAO {
	Connection con= DBConnection.getConnection();
	
	public Employee addEmployee(Employee employee) {
		PreparedStatement ptmt=null;
	   String sql="insert into Employee values(?,?,?,?)";
	   try {
		ptmt=con.prepareStatement(sql);
		 ptmt.setInt(1, employee.getId());
		   ptmt.setString(2, employee.getEmpName());
		   ptmt.setString(3, employee.getDepartment());
		   ptmt.setFloat(4,employee.getSalary());
		   ptmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally {
		   try {
			ptmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   return employee;
	  
	}
	public  List<Employee> displayEmployee(){
		
		
		List<Employee> list= new ArrayList<Employee>();
		ResultSet rs=null;
		PreparedStatement ptmt=null;
		
		try {
			
			String sql="select Id,EmpName,Department,Salary from Employee";
			ptmt=con.prepareStatement(sql);
			 rs= ptmt.executeQuery();
			while(rs.next()) {
				int Id=rs.getInt(1);
				String EmpName=rs.getString(2);
				String Department=rs.getString(3);
				float Salary=rs.getFloat(4);
				Employee e= new Employee();
				e.setId(Id);
				e.setEmpName(EmpName);
				e.setDepartment(Department);
				e.setSalary(Salary);
				list.add(e);
				
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(ptmt!=null)
					ptmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
		
	}
	public Employee deleteEmployee(Employee employee) {
		String sql= "delete from Employee where Id=?";
		PreparedStatement ptmt=null;
		try {
			ptmt=con.prepareStatement(sql);
			ptmt.setInt(1, employee.getId());
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ptmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employee;
		
	}
	public Employee updateEmployee(Employee employee) {
		String sql= "Update Employee set EmpName=? where Id=?";
		PreparedStatement ptmt=null;
		try {
			ptmt=con.prepareStatement(sql);
			ptmt.setString(1, employee.getEmpName());
			ptmt.setInt(2, employee.getId());
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ptmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employee;
		
	}
	
}
