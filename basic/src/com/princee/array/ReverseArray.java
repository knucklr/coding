package com.princee.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 8, 1};
        System.out.println(Arrays.toString(arr));

        int[] revarr = reverseArray(arr);
        System.out.println("Reversed Array using Brute Force Approach: " + Arrays.toString(revarr));

        int[] revertarray = reverseArrayII(arr);
        System.out.println("Reversed Array is: " + Arrays.toString(revertarray));
    }

    private static int[] reverseArrayII(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }
        return(arr);
    }

    private static int[] reverseArray(int[] arr) {
        int[] revarr = new int[arr.length];
        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            revarr[j] = arr[i];
            j--;
        }
        return(revarr);
    }
}
