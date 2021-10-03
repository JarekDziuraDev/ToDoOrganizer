package com.example.todoorganizer;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.repository.AppRoleRepository;
import com.example.todoorganizer.service.AppRoleService;
import com.example.todoorganizer.utils.ConstantUtils;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SpringBootApplication
public class ToDoOrganizerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoOrganizerApplication.class, args);
    }
}
