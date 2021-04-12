package com.mypractice.liquibase.controller;

import com.mypractice.liquibase.domain.Department;
import com.mypractice.liquibase.repo.DepartmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") Long departmentId) {
        return ResponseEntity.of(Optional.ofNullable(departmentRepository.findById(departmentId).orElseThrow(()->new RuntimeException("record not found"))));
    }
}
