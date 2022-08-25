package com.hibernate.hibernate.onetomany.controller;

import com.hibernate.hibernate.onetomany.entity.User;
import com.hibernate.hibernate.onetomany.entity.UserAddress;
import com.hibernate.hibernate.onetomany.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/useraddress")
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;



    // one-to-many
    @GetMapping
    private List<UserAddress>getAll(){

        return userAddressService.getAll();
    }
    @GetMapping("/{id}")
    private UserAddress getById(@PathVariable Long id){

        return userAddressService.getById(id);
    }
    @PostMapping
    private UserAddress add(@RequestBody UserAddress userAddress){
        return userAddressService.addOrUpdate(userAddress);
    }
    @PutMapping("/{id}")
    private UserAddress update(@PathVariable int id, @RequestBody UserAddress userAddress){
    userAddress.setCountryId(id);
    return userAddressService.addOrUpdate(userAddress);
    }
    @DeleteMapping("/{id}")
    private void delete(@PathVariable Long id){
        userAddressService.deleteById(id);
    }

   /* @GetMapping("/firstname")
    private String findByFirstName(String firstName){
        return userAddressService.getByFirstName(firstName);

    }*/
}
