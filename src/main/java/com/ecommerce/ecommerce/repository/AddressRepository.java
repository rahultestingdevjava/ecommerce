package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
