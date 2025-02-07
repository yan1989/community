package com.app.community.service;

import com.app.community.entity.User;
import com.app.community.repository.UserRepository;
import com.app.community.security.AuthUserDetails;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CommunityUserDetailsService implements UserDetailsService {

  @Resource
  private UserRepository userRepository;

  @Override
  @Cacheable(value = "users", key = "#username")
  public UserDetails loadUserByUsername(String username) {
    User user = userRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("用户名或密码错误!");
    }
    return new AuthUserDetails(user);
  }
}
