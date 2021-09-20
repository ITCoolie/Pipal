package com.pipal.server.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class Response implements Serializable {

    private static final long serialVersionUID = -1L;

    private int status = 0; 
}