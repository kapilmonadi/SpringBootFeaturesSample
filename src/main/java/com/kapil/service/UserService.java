package com.kapil.service;

import com.kapil.dto.UserRecord;
import com.kapil.exception.UserFetchException;
import org.springframework.retry.annotation.Retryable;

public interface UserService {

    @Retryable(retryFor = {UserFetchException.class})
    UserRecord getUser(Long userId);
    String getUserFailureMessage();
}
