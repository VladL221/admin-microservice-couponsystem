package com.example.demo.adminmicroservice.controllers;

import com.example.demo.adminmicroservice.beans.Admin;
import com.example.demo.adminmicroservice.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("adminLogger")
@RequiredArgsConstructor
public class AdminController {


    private final AdminService service;

    @PostMapping("/addLog")
    public CompletableFuture<CompletableFuture<Admin>> addAdminLog(@RequestBody Admin admin){
        return CompletableFuture.completedFuture(service.addAdminLog(admin));
    }

    @GetMapping("/getAllLogs")
    public CompletableFuture<ResponseEntity<?>> getAllAdminLogs(){
        return service.getAllLogs().thenApply(ResponseEntity::ok);
    }

    @GetMapping("/{type}")
    public CompletableFuture<ResponseEntity<?>> getAllAdminLogsByType(@PathVariable String type){
        return service.getAllLogsByTpe(type).thenApply(ResponseEntity::ok);
    }



}
