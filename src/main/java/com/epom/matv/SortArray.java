package com.epom.matv;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Vasyl Zarva.
 */
public class SortArray {
    /**
     * {@link Random} generator.
     */
    private static final Random RANDOM = new Random();

    public static void defineTwoMetcesArray(int[][] array){
        if (array.length < 0)
            throw new IllegalArgumentException("Variable Start should be bigger than variable END");

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.ints(array[i].length, -100, 99).toArray();
        }
    }

    public static  void bubbleSortArray(int[][] array){
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length - 1; j++){
                    if(array[i][j] < array[i][j+1]){
                        temp = array[i][j];
                        array[i][j] = array[i][j+1];
                        array[i][j+1] = temp;
                        flag = true;
                    }
                }
            }
        }
    }
    public static void sortArrayFunction(int[][] array){
        for(int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
    }
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println();
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("<-------------->");
    }
}
