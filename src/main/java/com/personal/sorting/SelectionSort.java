package com.personal.sorting;

public class SelectionSort {

    // Find minimum and put it at start
    // https://www.geeksforgeeks.org/selection-sort/
    // Complexity, O(n^2)
    // Less memory impact
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 96, 11};

        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
