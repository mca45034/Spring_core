package com.rays.service;

import java.util.List;

import com.rays.dto.EmployeDTO;

public interface EmployeServiceInt {
	public long add(EmployeDTO dto);
	public void update(EmployeDTO dto);
	public void delete(long id);
	public EmployeDTO findByLogin(String login);

	public EmployeDTO authenticate(String login, String password);

	public EmployeDTO findByPK(long pk);

	public List search(EmployeDTO dto);

}
