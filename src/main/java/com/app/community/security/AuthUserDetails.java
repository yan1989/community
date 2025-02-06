package com.app.community.security;

import com.app.community.entity.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Data
public class AuthUserDetails implements UserDetails {

  private Long uid;
  private String username;
  private String password;
  private String nickname;
  private String avatar;
  private String email;
  private Date regdate;
  private Collection<? extends GrantedAuthority> authorities;

  public AuthUserDetails(User user) {
    this.uid = user.getUid();
    this.username = user.getUsername();
    this.nickname = user.getNickname();
    this.avatar = user.getAvatar();
    this.email = user.getEmail();
    this.regdate = user.getRegdate();
    this.authorities = user.getRoles()
      .stream()
      .map(role -> new SimpleGrantedAuthority(role.getName()))
      .collect(Collectors.toList());
  }

}
