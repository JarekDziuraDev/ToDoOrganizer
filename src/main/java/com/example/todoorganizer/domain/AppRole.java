package com.example.todoorganizer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "app_role")

public class AppRole extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @OneToMany(targetEntity = AppUser.class, mappedBy = "appRole", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AppUser> users;

    public AppRole() {}

    public AppRole(String name) {this.name = name;}

    public String getName() {return name;}

}
