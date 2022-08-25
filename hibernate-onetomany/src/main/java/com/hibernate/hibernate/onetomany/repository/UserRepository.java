package com.hibernate.hibernate.onetomany.repository;

import com.hibernate.hibernate.onetomany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
