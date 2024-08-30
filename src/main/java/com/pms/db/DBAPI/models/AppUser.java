package com.pms.db.DBAPI.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(unique = true, nullable = false)
    private Long phoneNumber;
    private String userType;
    private String userRole;
    private String country;
    private String zipcode;
    private String industry;
    private Integer age;
}
