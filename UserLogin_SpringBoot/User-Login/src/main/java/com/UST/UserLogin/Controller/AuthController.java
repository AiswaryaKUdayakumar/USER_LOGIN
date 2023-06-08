package com.UST.UserLogin.Controller;

import com.UST.UserLogin.Model.User;
import com.UST.UserLogin.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/register")
    public User Register(@RequestBody User user){
        return authService.register(user);
    }
    @PostMapping("/login")
    public User login(@RequestBody User user){
        return authService.login(user);
    }
}
