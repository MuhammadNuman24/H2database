package com.example.H2database.Service;

import com.example.H2database.Entities.UserEntity;
import com.example.H2database.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInterface{
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<UserEntity> userList() {
     return (List<UserEntity>) userRepo.findAll();
    }
}
