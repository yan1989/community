package com.app.community.controller;

import com.app.community.service.PostService;
import com.app.community.service.SectionService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class BaseController {

  @Resource
  SectionService sectionService;

  @Resource
  PostService postService;


  @GetMapping("/")
  public String index(ModelMap model) {
    List<Map<String, Object>> sections = sectionService.findAllWithPostCount();
    Page<Map<String, Object>> posts = postService.findNewPosts(0, 10);
    model.addAttribute("sections", sections);
    model.addAttribute("posts", posts.getContent());
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
