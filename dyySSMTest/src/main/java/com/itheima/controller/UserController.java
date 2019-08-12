package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
@RequestMapping("/findUserById")
    public ModelAndView findUserById(ModelAndView modelAndView){
    User user = userService.findUserById(2);
    modelAndView.addObject("user",user);
    modelAndView.setViewName("userList");
    return modelAndView;
    }
}
