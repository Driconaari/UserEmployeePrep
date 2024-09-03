package com.example.useremployeeprep.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    Userrepository userrepository;


    @Override
    public void run(String... args) throws Exception {
        User us1 = new User();
        us1.setEmail("johnlarsen@gmailcom");
        us1.setPassword("1234");
        userrepository.save(us1);

        us1.setUserID(0);
        us1.setEmail("kurtlarsen@gmail.com");
        us1.setPassword("1234");
        userrepository.save(us1);

        us1.setUserID(0);
        us1.setEmail("larslarsen@gmail.com");
        us1.setPassword("1234");
        userrepository.save(us1);
    }
}