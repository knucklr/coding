package com.princee.array;

public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] arr = {21, 45, 11, -9, 33, 90};
        int ans = secondMaxNumber(arr);
        System.out.println(ans);
    }

    private static int secondMaxNumber(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            } else if (arr[i] < second && second < first) {
                second = arr[i];
            }
        }
        return(second);
    }
}
