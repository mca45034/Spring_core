package com.rays.dao;

import java.util.List;

import com.rays.dto.EmployeDTO;

public interface EmployeDAOInt {
	public long add(EmployeDTO dto);
	public void update(EmployeDTO dto);
	public void delete(long id);
	public EmployeDTO findByLogin(String login);

	public EmployeDTO authenticate(String login, String password);

	public EmployeDTO findByPK(long pk);

	public List search(EmployeDTO dto);


}
