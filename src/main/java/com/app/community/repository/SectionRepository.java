package com.app.community.repository;

import com.app.community.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SectionRepository extends JpaRepository<Section, Long> {

  @Query("select s.id AS id,s.name AS name,size(s.posts) AS postCount from Section AS s ORDER BY s.id asc ")
  List<Map<String, Object>> findAllWithPostsCount();
}
