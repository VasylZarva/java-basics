package com.epom.matv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * @author Vasyl Zarva.
 */
public class Main {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        SortArray.defineTwoMetcesArray(array);
        SortArray.printArray(array);
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for(int i = 0; i < o1.length ; i++){
                    for (int j = 0; j < o2.length; j++){
                        if(o1[i] < o2[j]){
                            int temp = o1[i];
                            o1[i] = o2[j];
                            o2[j] = temp;
                        }
                    }
                }
                return 0;
            }
        });
        SortArray.printArray(array);
    }
}
