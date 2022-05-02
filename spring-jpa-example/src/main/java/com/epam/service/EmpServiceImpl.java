package com.epam.service;

import com.epam.dao.EmployeeRepository;
import com.epam.dto.Address;
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
        Address address = new Address("Choolaimedu","600094");
        Address address1 = new Address("Sakkarajakottai","626117");
        Address address2 = new Address("Ponnagaram","626108");
        Address address3 = new Address("Ranchod Nagar","360311");


        employees.add(new Employee("Ravi","Chennai",address));
        employees.add(new Employee("Shaji","Davenegere",address1));
        employees.add(new Employee("Kiran","Bombay",address2));
        employees.add(new Employee("Raja","New York",address3));

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
