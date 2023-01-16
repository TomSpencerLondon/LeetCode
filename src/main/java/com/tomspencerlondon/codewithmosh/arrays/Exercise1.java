package com.tomspencerlondon.codewithmosh.arrays;

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
    }
}
