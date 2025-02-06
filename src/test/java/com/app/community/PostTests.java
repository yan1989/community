package com.app.community;

import com.app.community.entity.Post;
import com.app.community.entity.Section;
import com.app.community.entity.User;
import com.app.community.repository.PostRepository;
import com.app.community.repository.SectionRepository;
import com.app.community.repository.UserRepository;
import com.app.community.utils.SummaryExtractor;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class PostTests {

  @Resource
  SectionRepository sectionRepository;

  @Resource
  PostRepository postRepository;

  @Resource
  UserRepository userRepository;

  @Test
  public void initPostData() {

    User user = userRepository.findById(4L).orElse(null);
    Section section = sectionRepository.findById(1L).orElse(null);
    Post post = new Post();
    post.setUser(user);
    post.setSection(section);
    post.setTitle("Starting CommunityApplication");
    post.setContent(Content.content);
    post.setSummary(SummaryExtractor.generate(Content.content, 151));
    post.setDate(new Date());
    postRepository.save(post);

  }
}
