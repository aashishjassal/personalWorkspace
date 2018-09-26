package com.personal.sorting;

public class BubbleSort {

    // https://www.geeksforgeeks.org/bubble-sort/
    // Swap adjacent elements
    // Complexity, O(n^2),
    // Minimum time if array is already sorted
    // Complexity reduced by stopping swap if no swap was done in one round
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 96, 11};
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
