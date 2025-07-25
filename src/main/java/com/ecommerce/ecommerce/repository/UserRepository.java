package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.model.User;
@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
     User findByEmail(String email);

     boolean existsByEmail(String email);


    
    // ✅ Check if an email exists
   
}



