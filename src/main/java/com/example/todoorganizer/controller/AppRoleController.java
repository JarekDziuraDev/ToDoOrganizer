package com.example.todoorganizer.controller;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.repository.AppRoleRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/roles")
@RequiredArgsConstructor
public class AppRoleController {

    private final AppRoleRepository appRoleRepository;

    @GetMapping
    ResponseEntity<List<AppRole>> readAllRoles() {
        return ResponseEntity.ok(appRoleRepository.findAll());
    }



}
