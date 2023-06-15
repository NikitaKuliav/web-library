package ru.skypro.lessons.springboot.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary/sum")
    public int getSumSalary(){
        return employeeService.getSumSalary();
    }
    @GetMapping("/salary/min")
    public int min(){
        return employeeService.getMinSalary();
    }
    @GetMapping("/salary/max")
    public int max(){
        return employeeService.getMaxSalary();
    }
    @GetMapping("/high-salary")
    public List highSalary(){
        return employeeService.getHighSalary();
    }
}
