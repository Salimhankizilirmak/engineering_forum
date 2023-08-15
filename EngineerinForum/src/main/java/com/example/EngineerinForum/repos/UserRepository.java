package com.example.EngineerinForum.repos;

import com.example.EngineerinForum.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
