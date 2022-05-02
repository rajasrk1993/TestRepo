package com.epam.service;

import com.epam.dao.EmployeeRepository;
import com.epam.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>)employeeRepository.findAll();

    }

    @Override
    public Employee findAllEmployeeByID(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent())
        {
            return opt.get();
        }
        else {
            return null;
        }


    }

    @Override
    public void addEmployee() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ravi","Chennai"));
        employees.add(new Employee("Shaji","Davenegere"));
        employees.add(new Employee("Kiran","Bombay"));
        employees.add(new Employee("Raja","New York"));

        for(Employee employee: employees)
        {
            employeeRepository.save(employee);
        }


    }

    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }
}
