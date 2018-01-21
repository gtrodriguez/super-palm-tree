package com.papermachetedesign.connectx.repositories;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public UserRepository(MongoTemplate mongoDbFactory) {

    }
}
