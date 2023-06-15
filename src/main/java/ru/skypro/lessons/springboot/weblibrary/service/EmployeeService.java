package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.List;

public interface EmployeeService {
    int getSumSalary();
    int getMinSalary();
    int getMaxSalary();
    List<Employee> getHighSalary();
}
