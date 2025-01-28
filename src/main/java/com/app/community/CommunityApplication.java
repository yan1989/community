package com.app.community;

import org.beetl.ext.spring6.EnableBeetl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableBeetl
public class CommunityApplication {

 public static void main(String[] args) {
  SpringApplication.run(CommunityApplication.class, args);
 }

}
