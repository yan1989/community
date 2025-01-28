package com.app.community.security;

import com.app.community.entity.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class AuthUserDetails implements UserDetails {

 private Long uid;
 private String username;
 private String password;
 private String email;
 private Collection<? extends GrantedAuthority> authorities;

 public AuthUserDetails(User user) {
  this.uid = user.getUid();
  this.username = user.getUsername();
  this.password = user.getPassword();
  this.email = user.getEmail();
  this.authorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName()))
    .collect(Collectors.toList());
 }
}
