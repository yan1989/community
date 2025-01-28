package com.app.community.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
 @Override
 public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                     Authentication authentication) throws IOException {
  response.setStatus(HttpServletResponse.SC_OK); // 返回 200 状态码
  response.getWriter().write("Login success!");
 }
}
