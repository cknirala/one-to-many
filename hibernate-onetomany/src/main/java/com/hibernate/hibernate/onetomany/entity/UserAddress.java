package com.hibernate.hibernate.onetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer countryId;
    private String correspondenceAddress;
    private String permanentAddress;
    private String city;
    private String state;
    private Long pinCode;

    //@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   // @JoinColumn(name = "users_id" ,nullable = false)
  //  private User user;

   /* @Transient
    private Long userId;*/





}
