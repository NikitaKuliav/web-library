package ru.skypro.lessons.springboot.weblibrary.repository;

import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeRespository {

    ArrayList<Employee> getEmployees();
    int employeeMaxSalary();
    int employeeMinSalary();
    int employeeSumSalary();
    ArrayList<Employee> employeeHighSalary();
}
