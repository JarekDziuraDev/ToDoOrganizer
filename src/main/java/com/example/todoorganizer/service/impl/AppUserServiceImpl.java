package com.example.todoorganizer.service.impl;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.domain.AppUser;
import com.example.todoorganizer.repository.AppRoleRepository;
import com.example.todoorganizer.repository.AppUserRepository;
import com.example.todoorganizer.service.AppRoleService;
import com.example.todoorganizer.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private AppUserRepository appUserRepository;

    @Override
    public Collection<AppUser> findAll() {
        return appUserRepository.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepository.findById(id);
    }

    @Override
    public Collection<AppUser> findByName(String name) {
        return appUserRepository.findByName(name);
    }

    @Override
    public AppUser saveOrUpdate(AppUser appUser) {
        return appUserRepository.saveAndFlush(appUser);
    }


}
