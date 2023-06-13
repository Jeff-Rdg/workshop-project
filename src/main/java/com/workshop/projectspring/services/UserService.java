package com.workshop.projectspring.services;

import com.workshop.projectspring.entities.User;
import com.workshop.projectspring.repository.IUserRepository;
import com.workshop.projectspring.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public User insert(User obj) {
        return userRepository.save(obj);
    }
}
