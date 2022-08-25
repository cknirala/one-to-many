package com.hibernate.hibernate.onetomany.service;

import com.hibernate.hibernate.onetomany.entity.User;
import com.hibernate.hibernate.onetomany.entity.UserAddress;
import com.hibernate.hibernate.onetomany.repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Service
public class UserAddressService {
    @Autowired
    private UserAddressRepository userAddressRepository;

    //One-to-many relation
    public UserAddress addOrUpdate(UserAddress userAddress){

        return userAddressRepository.save(userAddress);
    }
    public boolean deleteById(Long id){
        userAddressRepository.deleteById(id);
        return true;
    }


    public List<UserAddress> getAll(){

        return userAddressRepository.findAll();
    }
    public UserAddress getById(Long id){

        return userAddressRepository.findById(id).get();
    }


    //Many-to-One relation
   /* public UserAddress addOrUpdate(UserAddress userAddress) {

        return userAddressRepository.save(userAddress);
    }

    public boolean deleteById(Long id) {
        userAddressRepository.deleteById(id);
        return true;
    }


    public List<UserAddress> getAll() {

        return userAddressRepository.findAll();
    }

    public UserAddress getById(Long id) {

        return userAddressRepository.findById(id).get();
    }

    public String getByFirstName(String firstName) {
          return userAddressRepository.findByFirstName(firstName);
    }*/
}

