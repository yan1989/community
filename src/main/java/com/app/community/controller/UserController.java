package com.app.community.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

  @PreAuthorize("hasAuthority('USER')")
  @GetMapping("/profile")
  public String profile() {
    return "ftl/user_profile";
  }
}
