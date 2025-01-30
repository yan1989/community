package com.app.community.security;

import com.app.community.service.CommunityUserDetailsService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {


  @Resource
  AjaxAuthenticationSuccessHandler authenticationSuccessHandler;

  @Resource
  AjaxAuthenticationFailureHandler authenticationFailureHandler;

  @Resource
  AjaxLogoutSuccessHandler logoutSuccessHandler;

  @Resource
  CommunityUserDetailsService userDetailsService;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    http.authorizeHttpRequests(authorize -> authorize.anyRequest()
      .permitAll());
    http.formLogin(form -> form.loginPage("/login")
        .loginProcessingUrl("/procssLogin")
        .permitAll()
        .successHandler(authenticationSuccessHandler)
        .failureHandler(authenticationFailureHandler))
      .logout(logout -> logout.logoutUrl("/logout") // 注销 URL
        .logoutSuccessHandler(logoutSuccessHandler)
        .permitAll())// 允许所有用户注销
      .userDetailsService(userDetailsService)
      .csrf(AbstractHttpConfigurer::disable);

    return http.build();
  }


  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
