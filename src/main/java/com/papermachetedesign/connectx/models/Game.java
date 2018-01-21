package com.papermachetedesign.connectx.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "games")
public class Game {
    public int id;
    public String player1;
    public String player2;
    public String currentPlayer;
    public ArrayList<ArrayList<String>> scoreBoard;
    public boolean completed;
    public boolean isActive;
    public Date lastUpdated;
    public boolean gameOver;
    public String inviteeEmail;
}
