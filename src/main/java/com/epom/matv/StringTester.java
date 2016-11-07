package com.epom.matv;

import com.sun.deploy.util.StringUtils;

/**
 * @author Vasyl Zarva.
 */
public class StringTester {


    public static boolean isEmpty(String str){
        return str == null || str.trim().isEmpty();
    }

    public static String reverse(String str){
        char[] charsFromStr = str.toCharArray();
        char [] reversedString = new char[charsFromStr.length];
        for (int i = 0; i < charsFromStr.length; i++) {
            reversedString[i] =  charsFromStr[charsFromStr.length-1-i];
        }
        return String.valueOf(reversedString);
    }

    public static String removeWhiteSpaces(String str){
        return str.replaceAll(" ", "");
    }


    public static void main(String[] args) {

    }
}
