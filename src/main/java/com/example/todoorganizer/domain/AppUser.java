package com.example.todoorganizer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
@Data
@ToString(exclude = "password")
public class AppUser extends BaseEntity{
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
