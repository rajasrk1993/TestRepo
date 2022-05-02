package com.epam.dao;

import com.epam.dto.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
