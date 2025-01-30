package com.app.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


  @GetMapping("/")
  public String index() {
    return "ftl/index";
  }

  @GetMapping("/login")
  public String login() {
    return "ftl/user-login";
  }

  @GetMapping("/register")
  public String register() {
    return "ftl/user-register";
  }

}
