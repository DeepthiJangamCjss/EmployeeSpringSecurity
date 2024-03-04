package com.example.employeeJDBC.Repository;

import com.example.employeeJDBC.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
