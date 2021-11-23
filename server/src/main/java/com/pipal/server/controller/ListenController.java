package com.pipal.server.controller;

import com.pipal.server.configure.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**listen controller class
 * */
@Slf4j
@RestController
@RequestMapping(path="/api/listen/v1")
public class ListenController {

    @Resource
    private Config config;

    @RequestMapping(path = "/event", method = {RequestMethod.POST})
    public String event(@RequestParam String token, @RequestBody String data) {

        return "ok";
    }
}
