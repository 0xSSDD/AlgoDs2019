package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibRecursion(5));

    }
    public static int fibRecursion(int n) {
        if (n <2)
            return n;

        else
            return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

}
