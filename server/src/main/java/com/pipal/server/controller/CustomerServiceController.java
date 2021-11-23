package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api/customerservice/v1")
public class CustomerServiceController {

    @Resource
    private Config config;  //config

    @RequestMapping(path = "/login", method = {RequestMethod.POST})
    public String login(@RequestParam String token, @RequestBody String data) {

        return "ok";
    }

    @RequestMapping(path = "/logout", method = {RequestMethod.POST})
    public String logout(@RequestParam String token, @RequestBody String data) {

        return "ok";
    }

    @RequestMapping(path = "/register", method = {RequestMethod.POST})
    public String register(@RequestParam String token, @RequestBody String data) {

        return "register";
    }

    @RequestMapping(path = "/unregister", method = {RequestMethod.POST})
    public String unregister(@RequestParam String token, @RequestBody String data) {

        return "register";
    }

    @RequestMapping(path = "/get_detail", method = {RequestMethod.POST})
    public String getDetail(@RequestParam String token, @RequestBody String data) {

        return "get_detail";
    }
}