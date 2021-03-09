package com.example.demo.adminmicroservice.repo;

import com.example.demo.adminmicroservice.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {

    List<Admin> findAdminByClientType(String clientType);



}
