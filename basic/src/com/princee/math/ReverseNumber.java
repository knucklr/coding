package com.princee.math;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(345);
    }

    private static void reverseNumber(int num) {
        while(num != 0){
            int rem = num%10;
            num = num/10;
            System.out.print(rem);
        }
    }
}
