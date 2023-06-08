package com.workshop.projectspring.repository;

import com.workshop.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
