package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.model.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepositoryImpl;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRespository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRespository employeeRespository = new EmployeeRepositoryImpl();

    public int getSumSalary() {

        ArrayList<Employee> employeeArrayList = employeeRespository.getEmployees();
        int sum = 0;
        for (Employee employee : employeeArrayList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public int getMinSalary() {
        ArrayList<Employee> employeeArrayList = employeeRespository.getEmployees();
        int min = Integer.MAX_VALUE;
        for (Employee employee : employeeArrayList) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }

    public int getMaxSalary() {
        ArrayList<Employee> employeeArrayList = employeeRespository.getEmployees();
        int max = Integer.MIN_VALUE;
        for (Employee employee : employeeArrayList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public List<Employee> getHighSalary() {
        ArrayList<Employee> employeeArrayList = employeeRespository.getEmployees();
        int sum = getSumSalary();
        int average = sum / employeeArrayList.size();
        ArrayList<Employee> employeesBetterAverage = new ArrayList<>(10);

        for (Employee employee : employeeArrayList){
            if(employee.getSalary() > average) {
                employeesBetterAverage.add(employee);
            }
        }
        return employeesBetterAverage;
    }
}
