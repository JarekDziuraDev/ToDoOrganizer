package com.example.todoorganizer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "app_role")
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(targetEntity = AppUser.class, mappedBy = "appRole", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AppUser> users;

    public AppRole() {}

    public AppRole(String name) {
        this.name = name;
    }

    public String getName() {return name;}

}
