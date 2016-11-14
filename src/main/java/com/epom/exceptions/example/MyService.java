package com.epom.exceptions.example;

/**
 * @author Vasyl Zarva.
 */
public interface MyService {

    void parse() throws ParseException;
    void parseQuietly();
}
