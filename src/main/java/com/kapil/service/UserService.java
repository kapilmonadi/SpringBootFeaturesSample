package com.kapil.service;

import com.kapil.dto.UserRecord;
import com.kapil.exception.UserFetchException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface UserService {

    @Retryable(retryFor = {UserFetchException.class},
    maxAttempts = 3,
    backoff = @Backoff(delay = 2000))
    UserRecord getUser(Long userId);

    @Recover
    String getUserFailureMessage();
}
