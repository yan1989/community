package com.app.community;

import com.app.community.entity.Section;
import com.app.community.repository.SectionRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SectionTests {

  @Resource
  SectionRepository sectionRepository;

  @Test
  public void initSectionData() {

    Section section = new Section();
    section.setName("技术讨论");
    sectionRepository.save(section);

    section = new Section();
    section.setName("生活杂谈");
    sectionRepository.save(section);

    section = new Section();
    section.setName("资源共享");
    sectionRepository.save(section);

    section = new Section();
    section.setName("站务公告");
    sectionRepository.save(section);
  }
}
