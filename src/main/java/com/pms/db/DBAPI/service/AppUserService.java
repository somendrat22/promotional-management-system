package com.pms.db.DBAPI.service;

import com.pms.db.DBAPI.models.AppUser;
import com.pms.db.DBAPI.repository.AppUserRepository;
import com.pms.db.DBAPI.request.UserRegistrationRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    public void createUser(UserRegistrationRequestBody userRegistrationRequestBody){
        AppUser appUser = new AppUser();
        appUser.setEmail(userRegistrationRequestBody.getEmail());
        appUser.setPhoneNumber(userRegistrationRequestBody.getPhoneNumber());
        appUserRepository.save(appUser);
    }
}
