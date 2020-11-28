package com.sine;

public class NotEnoughComponentsException extends Exception {
    public NotEnoughComponentsException(String message) {
        super(message);
    }

    public NotEnoughComponentsException(String message, Throwable cause) {
        super(message, cause);
    }
}
