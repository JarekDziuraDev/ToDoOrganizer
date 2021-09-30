package com.example.todoorganizer.service;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.domain.AppUser;

import java.util.Collection;
import java.util.Optional;

public interface AppUserService {
    Collection<AppUser> findAll();
    Optional<AppUser> findById(Long id);
    Collection<AppUser> findByName(String name);
    AppUser saveOrUpdate(AppUser appUser);
}
