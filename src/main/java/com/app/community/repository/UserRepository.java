package com.app.community.repository;

import com.app.community.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
 User findByUsername(String username);
}
