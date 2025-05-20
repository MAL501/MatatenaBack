package com.matatena.matatenaback.repository;

import com.matatena.matatenaback.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {


UserEntity findByUsername(String username);}
