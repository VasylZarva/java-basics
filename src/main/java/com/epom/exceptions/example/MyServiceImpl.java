package com.epom.exceptions.example;

/**
 * @author Vasyl Zarva.
 */
public class MyServiceImpl implements MyService {
    @Override
    public void parse() throws ParseException {

    }

    @Override
    public void parseQuietly() {
        try {
            parse();
        } catch (ParseException e) {
            // do nothing
        }
    }
}
