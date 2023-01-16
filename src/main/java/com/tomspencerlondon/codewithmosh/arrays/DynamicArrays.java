package com.tomspencerlondon.codewithmosh.arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    public static void main(String[] args) {
        // Vector: 100% synchronized
        // ArrayList: 50%

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list);
    }
}
