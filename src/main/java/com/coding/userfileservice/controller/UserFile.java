package com.coding.userfileservice.controller;

import com.coding.userfileservice.model.UserData;
import com.coding.userfileservice.service.UserFileService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@RestController
@RequestMapping("/rest/v1")
public class UserFile {

    @Autowired
    UserFileService userFileService;

    @GetMapping(path = "/users-list")
    public ArrayList<String> getAllUsers() {
        ArrayList<String> userList = userFileService.getAllUsers();
        return userList;
    }

    @PostMapping(value = "/add-user", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    @ApiOperation(value = "Insert User Data in File")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "User data successfully inserted!!")
    })
    public void insertUserData (@RequestBody UserData userData, HttpServletResponse response) {
        userFileService.insertUserData(userData);
        response.setStatus(HttpServletResponse.SC_CREATED);
    }
}