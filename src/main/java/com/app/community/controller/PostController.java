package com.app.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/post")
public class PostController {

  private static final List<String> ALLOWED_CONTENT_TYPES = Arrays.asList("image/jpeg", "image/png", "image/gif",
    "image/ico");

  public static boolean isImage(MultipartFile file) {
    return ALLOWED_CONTENT_TYPES.contains(file.getContentType());
  }


  @GetMapping("/createPost")
  public String createPost() {
    return "ftl/create-post";
  }


  @ResponseBody
  @PostMapping("/save")
  public Map<String, Object> save(String title, String content, Long sectionId) {
    Map<String, Object> body = new HashMap<>();


    return body;
  }

  @ResponseBody
  @PostMapping("/uploadImage")
  public Map<String, Object> uploadImage(MultipartFile imageFile) throws IOException {
    String uploadPath = "D:\\Desktop\\upload\\";
    Map<String, Object> body = new HashMap<>();
    if (imageFile.isEmpty()) {
      body.put("errno", 1);
      body.put("message", "仅允许上传jpg、jpeg、png、gif格式的图片");
    }
    if (isImage(imageFile)) {
      Map<String, Object> data = new HashMap<>();
      String filename = imageFile.getOriginalFilename();
      assert filename != null;
      String extension = filename.substring(filename.lastIndexOf("."));//文件扩展名
      String newFileName = UUID.randomUUID() + extension;//随机名+文件扩展名
      imageFile.transferTo(new File(uploadPath + newFileName));
      data.put("url", "http://localhost:8080/images/head.webp");
      body.put("errno", 0);
      body.put("data", data);
    } else {
      body.put("errno", 1);
      body.put("message", "仅允许上传jpeg、png、gif格式的图片");
    }
    return body;
  }
}
