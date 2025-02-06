package com.app.community.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "comment")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 800, nullable = false)
  private String content;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @ManyToOne
  @JoinColumn(name = "post_id")
  private Post post;


}
