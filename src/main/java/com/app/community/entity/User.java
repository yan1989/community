package com.app.community.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long uid;

 @Column(unique = true, nullable = false)
 private String username;

 @Column(nullable = false)
 private String password;

 @Column(unique = true, nullable = false)
 private String email;

 @ManyToMany(fetch = FetchType.EAGER)
 @JoinTable(
   name = "user_role",
   joinColumns = @JoinColumn(name = "uid"),
   inverseJoinColumns = @JoinColumn(name = "role_id")
 )
 private List<Role> roles;

}
