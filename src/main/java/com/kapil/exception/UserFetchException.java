package com.kapil.exception;

public class UserFetchException extends RuntimeException{
    public UserFetchException(String message){
        super(message);
    }
}
