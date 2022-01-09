package com.example.H2database.Service;

import com.example.H2database.Entities.UserEntity;

public interface UserInterface {
    Iterable<UserEntity> userList ();
}
