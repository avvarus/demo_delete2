package com.company;

public class Palin {

    public static void main(String[] args) {

        Palin palin = new Palin();
        palin.temp(123);

    }


    public boolean temp(int x) {

        int reversed = 0;
        int orig = x;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            System.out.println("reversed = " + reversed);
            x = x / 10;
            System.out.println("x = " + x);

        }
        return reversed == orig;
    }
}
