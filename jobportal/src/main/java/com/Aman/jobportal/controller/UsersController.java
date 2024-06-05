package com.Aman.jobportal.controller;

import ch.qos.logback.core.model.Model;
import com.Aman.jobportal.entity.UsersType;
import com.Aman.jobportal.services.UsersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UsersController {
    private final UsersTypeService usersTypeService;


    @Autowired

    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }
    public String register(Model model){
        List<UsersType> usersTypes = usersTypeService.getAll();
    }
}
