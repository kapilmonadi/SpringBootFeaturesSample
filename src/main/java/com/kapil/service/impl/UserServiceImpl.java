package com.kapil.service.impl;

import com.kapil.dto.UserRecord;
import com.kapil.exception.UserFetchException;
import com.kapil.exception.UserNotFoundException;
import com.kapil.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserRecord getUser(Long userId) {
        //TODO
        //FIXME remove hardcoding and fetch an actual user from DB

        if(userId < 5){
            throw new UserFetchException("This user has been disabled");
        }
        else{
            return new UserRecord(1L, "Amit", "Kumar");
        }
    }

    @Override
    public String getUserFailureMessage(UserFetchException userFetchException) {
        throw new UserNotFoundException(userFetchException.getMessage());
    }
}
