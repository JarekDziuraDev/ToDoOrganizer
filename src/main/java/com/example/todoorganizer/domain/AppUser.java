package com.example.todoorganizer.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "app_user")
@ToString(exclude = "password")
public class AppUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole appRole;
}
