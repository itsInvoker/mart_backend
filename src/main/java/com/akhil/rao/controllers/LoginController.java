package com.akhil.rao.controllers;

import com.akhil.rao.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(path ="/login" , method = RequestMethod.GET)
    public Boolean logging(@RequestParam String username, @RequestParam String password){
        if(loginService.login(username, password))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
}
