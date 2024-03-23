package com.ITe.ShopFA.service;

import com.ITe.ShopFA.model.User;
import com.ITe.ShopFA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> selectByNameAndPassword(String userName, String password){
        return userRepository.selectByNameAndPassword(userName, password);
    }
}
