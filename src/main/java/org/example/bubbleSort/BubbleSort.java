package org.example.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[] {12, 8, 7, 5, 2})));
    }
}
