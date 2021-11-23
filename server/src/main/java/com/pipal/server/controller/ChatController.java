package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(path="/api/chat/v1")
public class ChatController {

    @Resource
    private Config config;  //config

    @RequestMapping(path = "/send_message", method = {RequestMethod.POST})
    public String sendMessage(@RequestParam String token, @RequestBody String data) {

        return "send_message";
    }

    @RequestMapping(path = "/recv_message", method = {RequestMethod.POST})
    public String recvMessage(@RequestParam String token, @RequestBody String data) {

        return "recv_message";
    }

    @RequestMapping(path = "/get_history", method = {RequestMethod.POST})
    public String getHistory(@RequestParam String token, @RequestBody String data) {

        return "get_history";
    }
}