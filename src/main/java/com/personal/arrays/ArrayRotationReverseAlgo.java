package com.personal.arrays;

public class ArrayRotationReverseAlgo {

    // https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverse(arr, 0, 1);
        reverse(arr, 2, 6);
        reverse(arr, 0, 6);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void reverse(int arr[], int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }
}
