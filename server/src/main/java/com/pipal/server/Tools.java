package com.pipal.server;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Tools {

    public static String newId() {
        return UUID.randomUUID().toString();
    }

    public static String GetTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}