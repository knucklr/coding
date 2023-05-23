package com.princee.math;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNum(75);
    }

    private static void primeNum(int num) {
        int count = 0;
        for(int i = 2; i < num/2; i++){
            if(num/i == 0){
                count++;
            }
        }
        if(count >= 2){
            System.out.println(num + " is not a Prime No.");
        } else {
            System.out.println(num + "is prime");
        }

    }
}
