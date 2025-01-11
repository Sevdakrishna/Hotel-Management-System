package com.SpringProjectHotel.HotelSystem.controller;

import com.SpringProjectHotel.HotelSystem.dto.LoginRequest;
import com.SpringProjectHotel.HotelSystem.dto.Response;
import com.SpringProjectHotel.HotelSystem.entity.User;
import com.SpringProjectHotel.HotelSystem.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user) {
        return ResponseEntity.status(userService.register(user).getStatusCode()).body(userService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.status(userService.login(loginRequest).getStatusCode()).body(userService.login(loginRequest));
    }
}
