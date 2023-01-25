package com.tomspencerlondon.codewithmosh.hashTables.mosh.linear;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(4);
        table.put("alpha", "zeta");
        table.put("beta", "theta");
        table.put("gamma", "tau");
        System.out.println(table);

    }
}
