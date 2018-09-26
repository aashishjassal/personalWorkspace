package com.personal.arrays;

public class ArrayRotationSimpleIteration {
    // https://www.geeksforgeeks.org/array-rotation/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr, 7, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void rotateArray(int[] arr, int arraySize, int noOfNodesToRotate) {
        for (int i = 0; i < noOfNodesToRotate; i++) {
            rotateLeftByOne(arr);
        }

    }

    static void rotateLeftByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

    }

}
