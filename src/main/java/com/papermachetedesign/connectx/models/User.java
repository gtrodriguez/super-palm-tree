package com.papermachetedesign.connectx.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    public int id;
    public String email;
    public String username;
}
