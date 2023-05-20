package com.princee.array;

public class MaxMin {

    public static void main(String[] args) {

        int a[] = {10, 34, -9, 54, -90};
        int ans[] = maxMin(a);
        System.out.println("Min no is : " + ans[0]);
        System.out.println("Max no is : " + ans[1]);
    }

    private static int[] maxMin(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        ans[0] = min;
        ans[1] = max;
        return(ans);
    }
}
