package com.princee.array;

public class ReverseNum {
    public static void main(String[] args) {
        reversenum(123);
    }

    private static void reversenum(int num) {
        int ans [] = new int[3];
        int r = 0;
        for(int i = 0; num != 0; i++){
            r = num%10;
            num = num/10;
            ans[i] = r;
            System.out.print(ans[i]);
        }
    }
}
