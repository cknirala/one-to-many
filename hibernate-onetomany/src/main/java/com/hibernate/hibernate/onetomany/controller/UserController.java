package com.hibernate.hibernate.onetomany.controller;

import com.hibernate.hibernate.onetomany.entity.User;
import com.hibernate.hibernate.onetomany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

                 // One-to-many relationship //
    @GetMapping
    private List<User>getAll(){

        return userService.getAll();
    }

    @GetMapping("/{id}")
    private User getById(@PathVariable Long id){

        return userService.getById(id);
    }

    @PostMapping
    private User add(@RequestBody User user){

        return userService.addOrUpdate(user);
    }

    @PutMapping("/{id}")
    private User update(@PathVariable Long id, @RequestBody User user){
        user.setId(id);
       return userService.addOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable Long id){

        userService.deleteById(id);
    }


                    // ***********Many-to-one relation************
     /*@GetMapping("/lastname")
     private String findByLastName(String lastName){
          userService.getByLastName(lastName);
          return "User fetched.";
     }*/

}
