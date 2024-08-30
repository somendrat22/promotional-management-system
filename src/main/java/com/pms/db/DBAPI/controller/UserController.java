package com.pms.db.DBAPI.controller;

import com.pms.db.DBAPI.models.AppUser;
import com.pms.db.DBAPI.request.UserRegistrationRequestBody;
import com.pms.db.DBAPI.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/api/db/user/create
// IOC ->


@RestController
@RequestMapping("/api/db/user")
public class UserController {

    @Autowired
    AppUserService appUserService;

    @PostMapping("/create")
    public String createUser(@RequestBody UserRegistrationRequestBody userRegistrationRequestBody){
        // call service layer
        appUserService.createUser(userRegistrationRequestBody);
        return "Created";
    }
}
