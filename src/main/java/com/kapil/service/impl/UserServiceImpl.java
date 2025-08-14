package com.kapil.service.impl;

import com.kapil.dto.UserRecord;
import com.kapil.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public UserRecord getUser(Long userId) {
        //TODO
        //FIXME remove hardcoding and fetch an actual user from DB
        return new UserRecord(1L, "Amit", "Kumar");
    }

    @Override
    public String getUserFailureMessage() {
        return "";
    }
}
