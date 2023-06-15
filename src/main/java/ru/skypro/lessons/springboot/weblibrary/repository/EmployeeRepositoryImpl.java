package ru.skypro.lessons.springboot.weblibrary.repository;


import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRespository {

    private static final List<Employee> EMPLOYEE_LIST = List.of(
            new Employee("Sergey", 80000),
            new Employee("Ivan", 90000),
            new Employee("Maria", 100000),
            new Employee("Anna", 110000),
            new Employee("Gleb", 70000)
    );


    @Override
    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(EMPLOYEE_LIST);
    }
}

