package com.epom.exceptions.example;

/**
 * @author Vasyl Zarva.
 */
public class MyApplication {

    public static void main(String[] args) {
        MyService service = new MyServiceImpl();

        service.parseQuietly();


        try {
            service.parse();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
