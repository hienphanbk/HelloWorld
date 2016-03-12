package com.viettel.demo;

/**
 * Created by hienpt on 9/3/15.
 */
public class Main {
    public static void main(String[] args) {
        double f = 62.5;
        double c = f2c(f);
        System.out.println(f+" F = " + c+ " C");
    }

     static double f2c(double f) {
        return f - 32*5/9;
    }
}
