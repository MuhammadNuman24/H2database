package com.example.H2database.Controller;

import com.example.H2database.Entities.UserEntity;
import com.example.H2database.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {
    private UserService  userService;
    @GetMapping("/list")
    public List<UserEntity> getList(){
        List<UserEntity> entityList=userService.userList();
        return entityList;
    }
}
