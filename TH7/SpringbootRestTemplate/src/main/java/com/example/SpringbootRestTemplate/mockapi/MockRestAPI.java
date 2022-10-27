package com.example.SpringbootRestTemplate.mockapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.SpringbootRestTemplate.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/mock")
public class MockRestAPI {

	private static final Map<Long, Employee> employees;
	private static Long nextID = 1L;

	static {
		employees = new HashMap<>();
		employees.put(nextID, new Employee("1", "Doe", "HCM"));
		employees.put(nextID, new Employee("2", "Long", "HCM"));
		employees.put(nextID, new Employee("3", "Tuan", "HCM"));
		employees.put(nextID, new Employee("4", "Minh", "HCM"));
		employees.put(nextID, new Employee("5", "Quang", "HCM"));
		employees.put(nextID, new Employee("6", "Zet", "HCM"));
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		Optional<Employee> employee = Optional.ofNullable(employees.get(id));
		return employee.orElse(null);
	}

}