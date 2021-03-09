package com.example.demo.adminmicroservice.services;

import com.example.demo.adminmicroservice.beans.Admin;
import com.example.demo.adminmicroservice.repo.AdminRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class AdminService {


    private final AdminRepo repo;

    @Async
    public CompletableFuture<Admin> addAdminLog(Admin admin){
        repo.save(admin);
        return CompletableFuture.completedFuture(admin);
    }

    @Async
    public CompletableFuture<List<Admin>> getAllLogs(){
        List<Admin> logs = repo.findAll();
        return CompletableFuture.completedFuture(logs);
    }

    @Async
    public CompletableFuture<List<Admin>> getAllLogsByTpe(String type){
        List<Admin> logs = repo.findAdminByClientType(type);
        return CompletableFuture.completedFuture(logs);
    }






}
