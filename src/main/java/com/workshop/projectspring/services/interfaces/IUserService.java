package com.workshop.projectspring.services.interfaces;

import com.workshop.projectspring.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    public List<User> findAll();
    public User findById(Integer id);

}
