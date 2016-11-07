package com.epom.matv;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Vasyl Zarva.
 */
public class Zakharchuk {
    public static void main(String[] args) {
        int numElem = 5;
        int[][] array = new int[numElem][numElem];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int randomNumber = random.nextInt(201) - 100;
                array[i][j] = randomNumber;
            }
        }
        System.out.println("5x5 by bubbleSort");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bubbleSort(array);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("5 by Array.sort()");
        int[] array1 = {8, 2, 3, 4, 5};
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("3x3 string array by Array.fill() ");
        String[][][] array2 = new String[3][3][3];
        Arrays.fill(array2, "test");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int z = 0; z < array2.length; z++) {
                    System.out.println(array2[i][j][z]);
                }

                //   UUID id1 = UUID.randomUUID();
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                for (int z = 0; z < array2.length; z++) {
//   //                 UUID id1 = UUID.randomUUID();
//            //        array2[i][j][z] = id1;
//                }
//            }
//
//
//        }
            }
        }
    }

    private static void bubbleSort(int arr [][]){
        int temp;
        boolean breakingFlag = false;
        while(!breakingFlag)
        {
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr.length; j++)
                {
                    if( j==arr.length-1 && i==arr.length-1)
                        break;
                    if ( j != arr.length-1)
                    {
                        if(arr[i][j] < arr[i][j+1])
                        {
                            temp = arr[i][j];
                            arr[i][j] = arr[i][j+1];
                            arr[i][j+1] = temp;
                            breakingFlag=true;
                        }
                    }
                    else
                    {
                        if(arr[i][j] < arr[i+1][0])
                        {
                            temp = arr[i][j];
                            arr[i][j] = arr[i+1][0];
                            arr[i+1][0] = temp;
                            breakingFlag=true;
                        }
                    }
                }
            }
        }
    }

}
