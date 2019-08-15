package com.company;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

//        int first[] = new int[5];
//        int first1[] = new int[5];
//
//        for(int i=0; i<3; i++ ){
//            first[i]=i;
//        }
//
//        for (int firs: first1) {
//            System.out.println(firs);
//        }


        // Insertion Sort

        int[] testArr = new int[]{32, 45, 23, 87, 98, 1, 56};

        System.out.println("Before --> " + Arrays.toString(testArr));


        int temp;
        int i, j;
        int n = testArr.length;

        for (i = 1; i < n; i++) {

            temp = testArr[i];

            j = i - 1;


            while (j >= 0 && testArr[j] > temp) {

                testArr[j + 1] = testArr[j];
                j--;
            }

            testArr[j + 1] = temp;

        }

        System.out.println("After --> " + Arrays.toString(testArr));

    }

}
