package com.epam.test;

import com.epam.dto.Employee;
import com.epam.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewController {

    @Autowired
    EmpServiceImpl empService;

    @PostMapping("/")
    public void add()
    {
        empService.addEmployee();
    }

    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee()
    {
        return empService.findAllEmployee();
    }

    @GetMapping("findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id)
    {
        return empService.findAllEmployeeByID(id);
    }

    @DeleteMapping("/delete")
    public void delete() {
        empService.deleteAllData();
    }




}
