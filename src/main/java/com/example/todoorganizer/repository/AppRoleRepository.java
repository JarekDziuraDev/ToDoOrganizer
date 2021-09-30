package com.example.todoorganizer.repository;

import com.example.todoorganizer.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long>{

    @Query(nativeQuery = true, value = "select count(*) > 0 from app_role where id=:id")
    boolean existsById(@Param("id") Long id);

    @Query("FROM AppRole WHERE name=:name")
    AppRole findByName(@Param("name") String name);
}
