package com.company.manager.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String password;

    private String address;

    private String pincode;

    private String city;

    private String state;

    private String verify;

    private String otp;
    
    private String type;

    @Column(name="date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date date;

    @OneToOne(mappedBy = "costumerEmail")
    private Cart cart;

    @OneToOne(mappedBy = "email")
    private Orders orders;
}
