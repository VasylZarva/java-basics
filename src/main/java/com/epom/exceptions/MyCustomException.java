package com.epom.exceptions;

/**
 * @author Vasyl Zarva.
 */
public class MyCustomException extends RuntimeException {


    private static final long serialVersionUID = -4916785759313587186L;

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
