package com.example.employee.service;

import com.example.employee.model.EmployeeModel;

public interface EmployeeServiceInterf {

	String getAllData();

	String addData(EmployeeModel empModel);

	String deleteAllData();

	String updateData();

	String getDataById();

	String deleteDataById();

}
