package com.example;

public class Series {

    public int nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return nSum(n-1) + n;
    }
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n-1);
    }
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
