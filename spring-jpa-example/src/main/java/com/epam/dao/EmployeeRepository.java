package com.epam.dao;

import com.epam.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
