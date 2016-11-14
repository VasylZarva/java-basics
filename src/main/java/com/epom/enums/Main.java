package com.epom.enums;

import java.util.Vector;

/**
 * @author Vasyl Zarva.
 */
public class Main {

    public static void main(String[] args) {
        someLogic(Month.FEBRUARY);
    }


    private static void someLogic(final Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("some logic for JANUARY");
                break;
            case FEBRUARY:
            case MARCH: {
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
                break;
            }
            case APRIL:
                System.out.println("some logic for APRIL");
                break;
            default:
                System.out.println("default logic");
        }
    }

    private static void someLogic(final int month) {

        switch (month) {
            case 1:
                System.out.println("some logic for JANUARY");
                break;
            case 2:
            case 3: {
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
                System.out.println("some logic for MARCH");
            }
            default:
                System.out.println("default logic");
        }
    }

    private static void someLogicc() {
//        final String month = "aldsf";
//        switch (month) {
//            case "1":
//                System.out.println("some logic for JANUARY");
//                break;
//            case "2":
//            case "3": {
//                System.out.println("some logic for MARCH");
//                System.out.println("some logic for MARCH");
//                System.out.println("some logic for MARCH");
//                System.out.println("some logic for MARCH");
//            }
//            default:
//                System.out.println("default logic");
//        }
    }
}
