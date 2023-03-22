package com.example.exception;

public class InvalidTrackIdException extends RuntimeException {
    public InvalidTrackIdException(String message) {
        super(message);
    }
}
