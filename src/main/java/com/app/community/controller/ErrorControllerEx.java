package com.app.community.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/error")
public class ErrorControllerEx implements ErrorController {


  @RequestMapping(produces = "text/html")
  public String handleError(HttpServletRequest request, HttpServletResponse response) {
    int httpStatus = getHttpStatus(response);
    if (httpStatus == HttpServletResponse.SC_NOT_FOUND) {
      return "404";
    } else if (httpStatus == HttpServletResponse.SC_FORBIDDEN) {
      return "403";
    } else if (httpStatus == HttpServletResponse.SC_UNAUTHORIZED) {
      return "401";
    } else {
      return "500";
    }
  }

  @ResponseBody
  @RequestMapping
  public ResponseEntity<Map<String, Object>> error(HttpServletRequest request, HttpServletResponse response) {
    int httpStatus = response.getStatus();
    Map<String, Object> body = new HashMap<>();
    if (httpStatus == HttpServletResponse.SC_NOT_FOUND) {
      body.put("error", "404");
      body.put("code", 404);
    } else if (httpStatus == HttpServletResponse.SC_FORBIDDEN) {
      body.put("error", "403");
      body.put("code", 403);
    } else if (httpStatus == HttpServletResponse.SC_UNAUTHORIZED) {
      body.put("error", "401");
      body.put("code", 401);
    } else {
      body.put("error", "500");
      body.put("code", 500);
    }
    return new ResponseEntity<>(body, HttpStatus.valueOf(httpStatus));
  }

  public int getHttpStatus(HttpServletResponse response) {
    return response.getStatus();
  }
}
