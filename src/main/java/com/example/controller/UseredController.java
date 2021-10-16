package com.example.controller;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/shop")
public class UseredController {

    @Autowired
    CompanyRepository uRepository;

}
