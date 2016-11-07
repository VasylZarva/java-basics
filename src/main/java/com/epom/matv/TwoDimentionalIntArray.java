package com.epom.matv;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Vasyl Zarva.
 */
public class TwoDimentionalIntArray {
    private final int[][] array;

    public TwoDimentionalIntArray() {
        array = new int[5][5];
    }

    public int[][] getArray() {
        return array;
    }

    public void initializeIntArray(){
        Random random = new Random();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = random.nextInt(200)-100;
            }
        }
    }

    public void bubblesortIntArray(){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                if (array[i][j] > array[i][j+1]) {
                    int temp = array[i][j];
                    array[i][j] = array[i][j+1];
                    array[i][j+1] = temp;
                }
            }
        }
    }

    public void sortIntArray(){
        for (int i = 0; i <array.length ; i++) {
            Arrays.sort(array[i]);
        }
    }

    public void printArray(){
        for (int i = 0; i <array.length ; i++) {
            System.out.println();
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }
    }

}
