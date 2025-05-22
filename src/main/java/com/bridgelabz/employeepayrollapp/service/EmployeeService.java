package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private List<Employee> employeeList = new ArrayList<>();
    private int idCounter = 1;

    public List<Employee> getAll() {
        return employeeList;
    }

    public Employee getById(int id) {
        return employeeList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public Employee create(Employee emp) {
        emp.setId(idCounter++);
        employeeList.add(emp);
        return emp;
    }

    public Employee update(int id, Employee emp) {
        Employee existing = getById(id);
        if (existing != null) {
            existing.setName(emp.getName());
            existing.setSalary(emp.getSalary());
        }
        return existing;
    }

    public void delete(int id) {
        employeeList.removeIf(e -> e.getId() == id);
    }
}

