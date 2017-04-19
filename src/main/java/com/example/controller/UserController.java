package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by NE1639 on 2017/4/18.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUserById(@RequestParam(name = "id") String id) {
        return userService.getUserById(id);
    }
    @RequestMapping(value = "/user/add",method = RequestMethod.PUT)
    public String addUser(@Valid @ModelAttribute("user") User user){
        return "redirect:/user/id";
    }
    @RequestMapping(value = "/user/delete/{id}",method = RequestMethod.GET)
    public String deleteUserById(@PathVariable("id") String id){
        return "success";
    }
    @RequestMapping(value = "/user/update/{id}",method = RequestMethod.GET)
    public String updateUserById(@PathVariable("id") String id){
        return "success";
    }
}
