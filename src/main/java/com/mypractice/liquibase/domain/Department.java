package com.mypractice.liquibase.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Data
@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @Column(name ="department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "department_name")
    private String departmentName;

}
