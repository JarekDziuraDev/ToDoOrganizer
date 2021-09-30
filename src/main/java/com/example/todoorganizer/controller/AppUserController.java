package com.example.todoorganizer.controller;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.domain.AppUser;
import com.example.todoorganizer.repository.AppRoleRepository;
import com.example.todoorganizer.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserRepository appUserRepository;

    @GetMapping
    ResponseEntity<List<AppUser>> readAllRoles() {
        return ResponseEntity.ok(appUserRepository.findAll());
    }



}
