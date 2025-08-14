package com.kapil.controller;

import com.kapil.dto.UserRecord;
import com.kapil.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/get/{userIdStr}")
    public ResponseEntity<UserRecord> getUserRecord(@PathVariable Optional<String> userIdStr){
        // hardcoded for now, replace with Service class invocation

        if(userIdStr.isPresent()){
            System.out.println("User id is " + userIdStr.get());
            return ResponseEntity.ok(new UserRecord(1L, "Amit", "Kumar"));
        }
        else{
            throw new UserNotFoundException(String.format("User with Id %s not found", "null"));
        }
    }
}
