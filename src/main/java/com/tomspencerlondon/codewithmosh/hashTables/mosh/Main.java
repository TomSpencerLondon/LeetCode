package com.tomspencerlondon.codewithmosh.hashTables.mosh;


public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable();

        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");
        System.out.println(table.get(6));
        System.out.println(table);
        System.out.println("Done");
    }
}
