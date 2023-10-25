package dev.raju.waltr_backend_assignment.repository;

import dev.raju.waltr_backend_assignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods


}
