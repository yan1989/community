package com.app.community.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSessionListener implements HttpSessionListener {

 public CustomSessionListener() {
 }

 @Override
 public void sessionCreated(HttpSessionEvent event) {
 }

 @Override
 public void sessionDestroyed(HttpSessionEvent event) {
 }
}
