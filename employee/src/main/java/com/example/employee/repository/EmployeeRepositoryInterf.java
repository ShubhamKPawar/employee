package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employee.model.EmployeeModel;

public interface EmployeeRepositoryInterf extends MongoRepository<EmployeeModel,String>{

	String getAllData();

	String addData(EmployeeModel empModel);

	String deleteAllData();

	String updateData();

	String getDataById();

	String deleteDataById();

}
