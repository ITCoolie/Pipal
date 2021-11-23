package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api/friends/v1")
public class FriendsController {

    @Resource
    private Config config;

    @RequestMapping(path = "/get_friends", method = {RequestMethod.POST})
    public String getFriends(@RequestParam String token, @RequestBody String data) {

        return "ok";
    }
}