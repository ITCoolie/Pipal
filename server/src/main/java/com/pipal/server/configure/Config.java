package com.pipal.server.configure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "service.config")
@Component
public class Config {

    private String token;

    /**database driver*/
    private String driver;

    /**database url*/
    private String url;

    /**database username*/
    private String username;

    /**database password*/
    private String password;
}
