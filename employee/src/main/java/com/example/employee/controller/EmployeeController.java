package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.EmployeeModel;
import com.example.employee.service.EmployeeServiceInterf;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	EmployeeController(){
		System.out.println("EmployeeController");
	}
	
	@Autowired(required=true)
	EmployeeServiceInterf employeeService;

	@GetMapping("/getAllData")
	String getAllData() {
		return employeeService.getAllData();
	}
	
	@PostMapping("/addData")
	String addData(@RequestBody EmployeeModel empModel) {
		return employeeService.addData(empModel);
	}
	
	@DeleteMapping("/deleteData")
	String deleteAllData() {
		return employeeService.deleteAllData();
	}
	
	@PutMapping("/updateData")
	String updateData() {
		return employeeService.updateData();
	}
	
	@GetMapping("/getById")
	String getDataById() {
		return employeeService.getDataById();
	}
	
	@DeleteMapping("/deleteById")
	String deleteDataById() {
		return employeeService.deleteDataById();
	}
}
