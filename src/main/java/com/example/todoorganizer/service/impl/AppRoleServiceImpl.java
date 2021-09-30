package com.example.todoorganizer.service.impl;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.repository.AppRoleRepository;
import com.example.todoorganizer.service.AppRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppRoleServiceImpl implements AppRoleService {

    private final AppRoleRepository appRoleRepository;

    @Override
    public Collection<AppRole> findAll() {
        return appRoleRepository.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return appRoleRepository.findById(id);
    }

    @Override
    public AppRole findByName(String name) {
        return appRoleRepository.findByName(name);
    }

    @Override
    public AppRole saveOrUpdate(AppRole appRole) {
        return appRoleRepository.saveAndFlush(appRole);
    }
}
