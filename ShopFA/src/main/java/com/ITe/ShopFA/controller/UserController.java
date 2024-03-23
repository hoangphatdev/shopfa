package com.ITe.ShopFA.controller;

import com.ITe.ShopFA.model.User;
import com.ITe.ShopFA.repository.UserRepository;
import com.ITe.ShopFA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
   @Autowired
    UserService userService;
   public List<User> fetchUserByNameAndPassword(String userName, String password){
       return userService.selectByNameAndPassword(userName, password);
   }

}
