package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import java.util.List;

public interface IEmployeeService {
	
    List<Employee> getAll();
    Employee getById(int id);
    Employee create(Employee emp);
    Employee update(int id, Employee emp);
    void delete(int id);

}
