package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api")
public class MainController {

    @Resource
    private Config config;

    @RequestMapping(path = "/test", method = {RequestMethod.POST})
    public String test(@RequestParam String token, @RequestBody String data) {

        return "test";
    }
}
