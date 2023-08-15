package com.example.EngineerinForum.controllers;

import com.example.EngineerinForum.entities.User;
import com.example.EngineerinForum.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users") // direkt mappingin tanımlı olmasını sağlıyor
public class UserController {
        private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }//tüm userları getiriyor
    @PostMapping //bir şeyler create etmeye yarıyor
    public User createUser(@RequestBody User newUser){
        return userService.saveOneUser(newUser);//istek yapılan new userı repositorye atıyoruz
    }
    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Long userId){
        //custom exception
        return userService.getOneUserById(userId);
    }
    @PutMapping("/{userId}")//var olan idli bir kullanıcıyı değiştirme
    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser)
    {
      return userService.updateOneUser(userId,newUser);
    }
    @DeleteMapping("/{userId}")//id ile delete işlemi
    public void deleteOneUser(@PathVariable Long userId){
        userService.deleteById(userId);
    }
}
