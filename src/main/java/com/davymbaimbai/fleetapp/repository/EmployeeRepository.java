package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
