package com.epam.backbone.rest;


import com.epam.backbone.model.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users/")
public class userService {

    @RequestMapping( value = "/get-all/", method = RequestMethod.GET)
    public @ResponseBody List<user> getUsersList(){
        ArrayList<user> users = new ArrayList<user>();

        users.add(new user("Mark","Johnson", 12));
        users.add(new user("Scott","Donovan", 12));
        users.add(new user("Jerry","Zukerman", 12));
        users.add(new user("Bony","Fletcher", 12));

        return users;
    }
}
