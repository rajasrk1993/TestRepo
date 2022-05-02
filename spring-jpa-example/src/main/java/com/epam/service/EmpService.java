package com.epam.service;

import com.epam.dto.Employee;

import java.util.ArrayList;

public interface EmpService {

    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();



}
