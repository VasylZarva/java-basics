package com.epom.matv;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

/**
 * @author Vasyl Zarva.
 */
public class StringMain {
    public static void main(String[] args) {
        String template = "Today is %s, ";
        String variable2 = ";lvkmq,sd[vkjwpejrhg;wlnx;,kalsdhfjed,rhpgi";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(String.format(template, formatter.format(new Date())));


        print("lasdf");
        print("lasdf", 1);
        print("lasdf", 1, 2);
        print("lasdf", 1, 2, 3);
    }

    public static void printVariable (final String variable) {
        System.out.println("Is String empty -> " + variable.isEmpty());
    }
    public static int countOccurrences(String source, String toFind) {
        int counter = 0;
        while (source.contains(toFind)) {
            source = source.replaceFirst(toFind, "");
            counter++;
        }
        return counter;
    }

    public static void print(String format, int... args) {
        int [] pointer = args;
        System.out.println("format");
    }

}
