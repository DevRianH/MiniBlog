package com.descomplica.frameblog.controllers;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.frameblog.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private @ResponseBody
    User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(path = "/getAll")
    @ResponseBody
    private List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping(path = "/get")
    @ResponseBody
    private User get(@RequestParam final Long id, @RequestBody User user) {
        return userService.get(id);
    }

    @PostMapping(path = "/update")
    @ResponseBody
    private User update(@RequestParam final Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping(path = "/delete")
    private ResponseEntity<?> delete(@RequestParam final Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    @ResponseBody
    public String authentication() {
        return "Hello Word";
    }

}
