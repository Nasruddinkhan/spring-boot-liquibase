package com.mypractice.liquibase.repo;

import com.mypractice.liquibase.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}