package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api/corp/v1")
public class CorpController {

    @Resource
    private Config config;  //config

    @RequestMapping(path = "/register", method = {RequestMethod.POST})
    public String register(@RequestParam String token, @RequestBody String data) {

        return "register";
    }

    @RequestMapping(path = "/get_detail", method = {RequestMethod.POST})
    public String getDetail(@RequestParam String token, @RequestBody String data) {

        return "get_detail";
    }
}