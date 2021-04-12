package com.mypractice.liquibase.repo;

import com.mypractice.liquibase.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
