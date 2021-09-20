package com.pipal.server.controller;

import com.pipal.server.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api/chat")
public class MainController {

    @Resource
    private Config config;

    @RequestMapping(path = "/send_message", method = {RequestMethod.POST})
    public String sendMessage(@RequestParam String token, @RequestBody String data) {
        
        return "send_message";
    }
}
