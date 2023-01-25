package com.tomspencerlondon.codewithmosh.part1linear.arrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);

        numbers.print();
        System.out.println(numbers.indexOf(50));

        numbers.removeAt(0);
        numbers.print();

//        numbers.removeAt(3);
        System.out.println(numbers.indexOf(50));

        System.out.println(numbers.max());

        Array arrayA = new Array(3);
        arrayA.insert(10);
        arrayA.insert(20);
        arrayA.insert(30);
        arrayA.insert(40);

        Array arrayB = new Array(3);
        arrayB.insert(10);
        arrayB.insert(20);
        arrayB.insert(30);
        System.out.println(Arrays.toString(arrayA.intersection(arrayB)));

        Array arrayC = new Array(3);
        arrayC.insert(10);
        arrayC.insert(20);
        arrayC.insert(30);
        arrayC.print();
        arrayC.reverse();
        System.out.println("Reversed numbers");
        arrayC.print();
    }
}
