package com.bridgelabz.employeepayrollapp.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Employee {
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1000, message = "Salary should be more than 1000")
    private double salary;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}