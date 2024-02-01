package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.EmployeeModel;
import com.example.employee.repository.EmployeeRepositoryInterf;

@Service
public class EmployeeService implements EmployeeServiceInterf {

	@Autowired(required=true)
	EmployeeRepositoryInterf employeeRepository;
	
	@Override
	public String getAllData() {
		return employeeRepository.getAllData();
	}

	@Override
	public String addData(EmployeeModel empModel) {
		return employeeRepository.addData(empModel);
	}

	@Override
	public String deleteAllData() {
		return employeeRepository.deleteAllData();
	}

	@Override
	public String updateData() {
		return employeeRepository.updateData();
	}

	@Override
	public String getDataById() {
		return employeeRepository.getDataById();
	}

	@Override
	public String deleteDataById() {
		return employeeRepository.deleteDataById();
	}

}
