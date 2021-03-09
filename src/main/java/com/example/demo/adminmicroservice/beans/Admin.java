package com.example.demo.adminmicroservice.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String methodType;
    @Column
    private Date executionDate;
    @Column
    private int statusCode;
    @Column
    private String clientType;
    @Column(nullable = false)
    private int clientId;



}
