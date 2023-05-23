package com.princee.array;

public class SecondMinNumber {
    public static void main(String[] args) {
        int[] arr = {3, -90, 65, 0, 11};
        int a = secondMinNumber(arr);
        System.out.println(a);
    }

    private static int secondMinNumber(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            } else if (arr[i] < second && second > first) {
                second = arr[i];
            }
        }
        return(second);
    }
}
