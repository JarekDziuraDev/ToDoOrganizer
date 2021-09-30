package com.example.todoorganizer.repository;

import com.example.todoorganizer.domain.AppRole;
import com.example.todoorganizer.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    @Query(nativeQuery = true, value = "select count(*) > 0 from app_user where id=:id")
    boolean existsById(@Param("id") Long id);

    @Query(nativeQuery = true, value = "select all from app_user where name=:name")
    Collection<AppUser> findByName(String name);
}
