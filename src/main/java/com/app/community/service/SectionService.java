package com.app.community.service;

import com.app.community.entity.Section;
import com.app.community.repository.SectionRepository;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SectionService {

  @Resource
  private SectionRepository sectionRepository;

  @Cacheable(value = "section")
  public List<Map<String, Object>> findAllWithPostCount() {
    return sectionRepository.findAllWithPostsCount();
  }

  @CacheEvict(value = "section")
  public void save(Section section) {
    sectionRepository.save(section);
  }

  @CacheEvict(value = "section")
  public void delete(Section section) {
    sectionRepository.delete(section);
  }

  @Cacheable(value = "section")
  public Section findOne(Long id) {
    return sectionRepository.findById(id).orElseThrow();
  }

}
