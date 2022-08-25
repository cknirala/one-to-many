package com.hibernate.hibernate.onetomany.service;

import com.hibernate.hibernate.onetomany.entity.User;
import com.hibernate.hibernate.onetomany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    private UserRepository userRepository;


            //One-to-many relation
    public User addOrUpdate(User user){

        return userRepository.save(user);
    }
    public boolean deleteById(Long id){
        userRepository.deleteById(id);
        return true;
    }
    public List<User>getAll(){
        return userRepository.findAll();
    }
    public User getById(Long id){
        return userRepository.findById(id).get();
    }

            //Many-to-One relation
   /* public User addOrUpdate(User user){
        return userRepository.save(user);
    }
    public boolean deleteById(Long id){
        userRepository.deleteById(id);
        return true;
    }
    public List<User>getAll(){
        return userRepository.findAll();
    }
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    public String getByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }
    */
}
