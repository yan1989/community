package com.app.community.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

 @PreAuthorize("hasAuthority('ADMIN')")
 @GetMapping
 public String adminPage() {
  return "admin/main";
 }
}
