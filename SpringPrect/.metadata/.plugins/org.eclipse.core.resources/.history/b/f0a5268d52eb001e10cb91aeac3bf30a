package com.rays.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.dto.EmployeDTO;
@Repository
public class EmployeDAOJDBCImp implements EmployeDAOInt{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public long add(EmployeDTO dto) {
		String sql="INSERT INTO EMPLOYE VALUES(?,?,?,?,?,?)";
		long pk=jdbcTemplate.update(sql,dto.getId(),dto.getName(),dto.getDepartment(),dto.getSalary(),dto.getAddress(),dto.getC_name());
		return pk;
	}

	public void update(EmployeDTO dto) {
		String sql="UPDATE FROM EMPLOYE SET NAME=?,DEPARTMENT=?,SALARY=?,ADDRESS=?,C_NAME=? WHERE ID=?";
		long i=jdbcTemplate.update(sql,dto.getName(),dto.getDepartment(),dto.getSalary(),dto.getAddress(),dto.getC_name(),dto.getId());
		System.out.println("jdbc update chalii");
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public EmployeDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(EmployeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
