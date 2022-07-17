package com.dev.petrovskiy.service;

import com.dev.petrovskiy.repository.model.User;
import com.dev.petrovskiy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User>findAllUsers(){
        return userRepository.findAll(/*Sort.by(Sort.Direction.ASC)*/);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }


}
