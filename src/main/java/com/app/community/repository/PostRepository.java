package com.app.community.repository;

import com.app.community.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

  @Query("select p.id as id,p.title as title,p.summary as summary,p.date as date,p.section.name as sectionName"
    + ", size(p.comments) as commentsCount,p.viewTimes as viewTimes, p.user.uid as uid,p.user.nickname as nickname "
    + " ,p.user.avatar as avatar from Post as p order by p.date desc")
  public Page<Map<String, Object>> findNewPosts(Pageable pageable);

}
