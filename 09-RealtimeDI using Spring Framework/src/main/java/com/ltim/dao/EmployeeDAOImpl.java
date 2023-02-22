package com.ltim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ltim.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private final String INSERT_QUERY = "INSERT INTO EMPLOYEE(ENO,ENAME,EADD,EPH,EGSAL,ENSAL) VALUES(?,?,?,?,?,?)";
	
	DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
		this.ds = ds;
	}
	
	@Override
	public int insertEmployee(EmployeeBO empBo) {
		
		int res = 0;
		
		try {
			Connection con = ds.getConnection();
			
			PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
			
			ps.setInt(1, empBo.getEid());
			ps.setString(2, empBo.getEname());
			ps.setString(3,empBo.getEadd());
			ps.setString(4, empBo.getEph());
			ps.setDouble(5, empBo.getEgsal());
			ps.setDouble(6, empBo.getEnsal());
			
			res = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
