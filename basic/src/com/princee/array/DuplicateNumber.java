package com.princee.array;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 11, 0, 3, 0};
        int []ans  = duplicateNumber(a);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] duplicateNumber(int[]a) {
        int slow=0;
        for(int fast = 1; fast < a.length; fast++){
            if(a[slow] != a[fast]){
                slow++;
                a[slow] = a[fast];
            }
        }
        return(a);
    }
}
