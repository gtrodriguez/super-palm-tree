package com.papermachetedesign.connectx.controllers;

import org.apache.log4j.Logger;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    static Logger log = Logger.getLogger(GameController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody()
    public String test() {
        log.info("does this even work???");

        return "index";
    }

    @MessageMapping("/select-game")
    public void selectGame(){
        log.info("select game");
    }

    @MessageMapping("/invite-player")
    public void invitePlayer(){
        log.info("invite player");
    }

    @MessageMapping("/register-game")
    public void registerGame(){
        log.info("register game");
    }

    @MessageMapping("/player-submit-turn")
    public void playerSubmitTurn(){
        log.info("player submit");
    }
}
