package com.ltim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.beans.Employee;

@Component("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private final String RETRIEVE_QUERY = "SELECT * FROM EMPLOYEE";
	
	@Autowired
	DataSource ds;
	
	@Override
	public List<Employee> getEmployeesList() {
				
		List<Employee> empList = null;
		
		try {
			Connection con = ds.getConnection();
			
			PreparedStatement ps = con.prepareStatement(RETRIEVE_QUERY);
			
			ResultSet rs = ps.executeQuery();
			
			empList = new ArrayList<>();
			
			while(rs.next()) {
			
				Employee e = new Employee();
				
				e.setEid(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setEadd(rs.getString(3));
				e.setEph(rs.getString(4));
				e.setEgsal(rs.getDouble(5));
				e.setEnsal(rs.getDouble(6));
				
				empList.add(e);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return empList;
	}

}
