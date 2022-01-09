package com.example.H2database.Repository;

import com.example.H2database.Entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <UserEntity, Long> {
}
