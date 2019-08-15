package com.company;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {


        int[] selectionSort = new int[]{10, 2, 45, 34, 67, 12, 90};

        int i, j, min;
        int n = selectionSort.length;


        System.out.println("selectionSort before = " + Arrays.toString(selectionSort));


        //Asuume min value is first Element
        for (i = 0; i < n - 1; i++) {

            min = i;

            // i =0

            for (j = 1; j < n; j++) {

                if (selectionSort[j] < selectionSort[min]) {

                    min = j; // 1
                }


                if (min != i) {
                    selectionSort[i] = selectionSort[min];
                }
            }


        }
        System.out.println("selectionSort after = " + Arrays.toString(selectionSort));

    }

    private static void swapFun() {
    }
}
