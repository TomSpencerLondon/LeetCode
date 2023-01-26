package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.recursion;

public class Main {

    public static void main(String[] args) {
        // 4! = 4 x 3 x 2 x 1
//         3! = 3 x 2 x 1
        // n! = n x (n - 1)!
        System.out.println(factorial(4));
    }

    // f(3)
    // 3 x f(2)
    //      2 x f(1)
    //          1 x f(0)
    // 3 x 2
    //      2 x 1
    //         1 x 1
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
