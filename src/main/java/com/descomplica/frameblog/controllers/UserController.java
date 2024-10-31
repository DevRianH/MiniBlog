package com.descomplica.frameblog.controllers;

import com.descomplica.frameblog.models.User;
import com.descomplica.frameblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/save")
    private @ResponseBody User save(@RequestBody User user){
        return userService.save(user);
    }
    
}
