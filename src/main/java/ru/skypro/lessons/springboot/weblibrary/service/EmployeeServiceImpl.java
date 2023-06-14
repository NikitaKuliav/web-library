package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.model.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepositoryImpl;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRespository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    EmployeeRespository employeeRespository = new EmployeeRepositoryImpl();
    public int getSumSalary(){
        return employeeRespository.employeeSumSalary();
    }
    public int getMinSalary(){
        return employeeRespository.employeeMinSalary();
    }
    public int getMaxSalary(){
        return employeeRespository.employeeMaxSalary();
    }
    public List<Employee> getHighSalary(){
        return employeeRespository.employeeHighSalary();
    }
}
