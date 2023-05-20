package com.princee.array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 32, 5, 17, 4};
        int val = 37;
        int ans[] = twosum(a,val);
        System.out.println(Arrays.toString(ans));

        int res[] = twoSumSorted(a,val);
        System.out.println(Arrays.toString(res));

    }

    private static int[] twoSumSorted(int[] a, int val) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length-1;
        int res[] = new int[2];
        while(i < j){
            if(a[i] + a[j] == val){
                res[0] = i+1;
                res[1] = j+1;
                break;
            } else if(a[i] + a[j] > val){
                j--;
            } else {
                i++;
            }
        }
        return(res);
    }

    private static int[] twosum(int[] a,int val) {

        int ans [] =new int[2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i]+ a[j] == val){
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        return(ans);
    }

}

