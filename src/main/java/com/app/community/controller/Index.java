package com.app.community.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {


  @GetMapping("/")
  public String index(@AuthenticationPrincipal UserDetails userDetails) {
    System.out.println("index");
    return "index.html";
  }

  @GetMapping("/login")
  public String login() {
    return "ftl/login";
  }

  @GetMapping("/register")
  public String register() {
    return "ftl/register";
  }

}
