package com.epom.exceptions;

/**
 * @author Vasyl Zarva.
 */
public class MyCatchedException extends Exception {


    private static final long serialVersionUID = 8104843282033972288L;

    public MyCatchedException(String message) {
        super(message);
    }

    public MyCatchedException(String message, Throwable cause) {
        super(message, cause);
    }
}
