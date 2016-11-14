package com.epom.exceptions.example;

/**
 * @author Vasyl Zarva.
 */
public class ParseException extends Exception {


    private static final long serialVersionUID = -8335240626600235747L;

    public ParseException(String message) {
        super(message);
    }

    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
