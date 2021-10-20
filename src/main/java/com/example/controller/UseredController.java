package com.example.controller;

import com.example.entity.Usered;
import com.example.repository.UseredRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/shop")
public class UseredController {

    @Autowired
    UseredRepository uRepository;

    // 127.0.0.1:8080/HOST/shop/join
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGET() {
        return "shop_join";
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPOST(@ModelAttribute Usered usered) {

        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        usered.setPassword(bcpe.encode(usered.getPassword()));

        uRepository.save(usered);
        return "shop_join";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET() {
        return "shop_login";
    }
}
