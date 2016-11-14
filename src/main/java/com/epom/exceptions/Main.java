package com.epom.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Vasyl Zarva.
 */
public class Main {

    public static void main(String[] args) {

        ;
        try (FileInputStream fileInputStream = new FileInputStream("lsdkfj")){

            // parse file logic
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseAndPrint(final String numStr) throws MyCatchedException {
        if (numStr == null || numStr.isEmpty())
            throw new IllegalArgumentException("argument is null");

        try {
            int num = Integer.parseInt(numStr);
            System.out.println(num);
        } catch (final NumberFormatException e) {
            System.out.println("Incoming string[" + numStr + "] is not a number.");
            throw new MyCatchedException("MyCustomException : Incoming string[" + numStr + "] is not a number.", e);
        }
    }

    private static void parse(final String numStr) {
        throw new IllegalArgumentException("argument is null");
    }
}


