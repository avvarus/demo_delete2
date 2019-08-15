package com.company;

import java.util.Arrays;

public class BuubleSort {


    public static void main(String[] args) {

        int[] bubbleSort = new int[]{10, 2, 34, 76, 23, 67, 1, 32, 19, 10};

        int i, j, temp;
        int n = bubbleSort.length;

        System.out.println("before bubbleSort = " + Arrays.toString(bubbleSort));

        for (i = 0; i < n - 1; i++) {

            boolean set = false;

            for (j = 0; j < n - 1; j++) {

                if (bubbleSort[j + 1] < bubbleSort[j]) {

                    temp = bubbleSort[j];

                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                    set = true;

                }
            }
            if (set == false)
                break;

        }
        System.out.println("after bubbleSort = " + Arrays.toString(bubbleSort));

    }
}
