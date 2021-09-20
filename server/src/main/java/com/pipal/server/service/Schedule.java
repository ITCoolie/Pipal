package com.pipal.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
@Slf4j
public class Schedule {

    @Scheduled(cron = "0 0 6 * * ?")
    public String timerTask() {
        return "ok";
    }
}
