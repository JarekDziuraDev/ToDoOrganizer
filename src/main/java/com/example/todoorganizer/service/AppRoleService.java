package com.example.todoorganizer.service;

import com.example.todoorganizer.domain.AppRole;

import java.util.Collection;
import java.util.Optional;

public interface AppRoleService {
    Collection<AppRole> findAll();
    Optional<AppRole> findById(Long id);
    AppRole findByName(String name);
    AppRole saveOrUpdate(AppRole appRole);

}
