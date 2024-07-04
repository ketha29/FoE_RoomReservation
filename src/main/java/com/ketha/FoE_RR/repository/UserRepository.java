package com.ketha.FoE_RR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ketha.FoE_RR.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
