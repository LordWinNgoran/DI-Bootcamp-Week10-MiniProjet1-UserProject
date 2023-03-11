package com.lordwin.userproject.repository;

import com.lordwin.userproject.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<Users, Integer> {
}