package com.app.community.service;

import com.app.community.repository.PostRepository;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PostService {

  @Resource
  private PostRepository postRepository;

  @Cacheable(value = "posts")
  public Page<Map<String, Object>> findNewPosts(int page, int limit) {
    Pageable pageable = PageRequest.of(page, limit);
    return postRepository.findNewPosts(pageable);
  }

}
