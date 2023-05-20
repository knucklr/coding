package com.princee.math;

public class OddEven {

    public static void main(String[] args) {
        evenOdd(7);
    }

    private static void evenOdd(int i) {
        if(i%2 == 0){
            System.out.println("It is an even number " + i);
        } else{
            System.out.println("It is a odd number " + i);
        }
    }


}
