package com.papermachetedesign.connectx.controllers;

import org.apache.log4j.Logger;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ConnectionController {
    static Logger log = Logger.getLogger(ConnectionController.class.getName());

    @MessageMapping("connect")
    @SendTo("")
    public void connect() {
        log.info("connect");
    }

    @MessageMapping("register")
    public void register() {
        log.info("register");
    }

    @MessageMapping("login")
    public void login(){
        log.info("login");
    }

    @MessageMapping("initial")
    public void initial(){
        log.info("initial");
    }
}
