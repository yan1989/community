package com.app.community.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "post")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false, length = 65535)
  private String content;


  @Column(nullable = false, length = 800)
  private String summary;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @Column(nullable = false)
  private int viewTimes = 0;

  @Temporal(TemporalType.TIMESTAMP)
  private Date updateTime;

  @ManyToOne
  @JoinColumn(name = "section_id")
  private Section section;

  @ManyToOne
  @JoinColumn(name = "uid")
  private User user;

  @OneToMany(mappedBy = "post")
  private List<Comment> comments;

}
