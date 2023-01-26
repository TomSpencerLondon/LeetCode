package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.recursion;

public class Main {

    public static void main(String[] args) {
        // 4! = 4 x 3 x 2 x 1
//         3! = 3 x 2 x 1

        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
