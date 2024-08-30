package com.pms.db.DBAPI.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRegistrationRequestBody {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long phoneNumber;
    private String userType;
    private String userRole;
    private String country;
    private String zipcode;
    private String industry;
    private Integer age;
}
