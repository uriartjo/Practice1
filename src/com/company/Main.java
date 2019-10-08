package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 9;
        int b = 9;
        double c = 10;
        a = a%b;
        c = c*a;
        System.out.println((c-b)/b%(5-c));
    }
}
