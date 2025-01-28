package com.app.community;

import com.app.community.entity.Role;
import com.app.community.entity.User;
import com.app.community.repository.RoleRepository;
import com.app.community.repository.UserRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

  @Resource
  private UserRepository userRepository;

  @Resource
  private RoleRepository roleRepository;

  @Resource
  private BCryptPasswordEncoder passwordEncoder;

  @Test
  public void initializeUserData() {

    // 初始化角色
    Role roleAdmin = new Role();
    roleAdmin.setName("ADMIN");
    roleRepository.save(roleAdmin);

    Role roleUser = new Role();
    roleUser.setName("USER");
    roleRepository.save(roleUser);

    // 初始化用户
    User admin = new User();
    admin.setUsername("admin");
    admin.setPassword(passwordEncoder.encode("000000"));
    admin.setEmail("admin@example.com");
    admin.setRoles(List.of(roleAdmin, roleUser));
    userRepository.save(admin);

    User user = new User();
    user.setUsername("user");
    user.setPassword(passwordEncoder.encode("1234567"));
    user.setEmail("user@example.com");
    user.setRoles(List.of(roleUser));
    userRepository.save(user);
  }

}
