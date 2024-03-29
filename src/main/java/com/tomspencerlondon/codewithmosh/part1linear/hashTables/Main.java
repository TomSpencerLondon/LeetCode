package com.tomspencerlondon.codewithmosh.part1linear.hashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Key: Employee number (Integer)
        // Value: Name (string)

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        map.put(3, "Marianne");
        map.put(4, null);
        map.put(null, null);
        map.remove(null);
        String value = map.get(3);
        System.out.println(value);
        System.out.println(map.containsKey(3)); // O(1)
        System.out.println(map.containsValue("Mosh")); // O(n)

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<Integer, String> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair);
        }

        System.out.println(map);

        System.out.println(hash("123456-A"));

        String str = "orange";
        System.out.println(str.hashCode());

        HashTable<Integer, String> hashTable = new HashTable<>();

        hashTable.put(1, "Tom");
        hashTable.put(2, "Richard");
        hashTable.put(3, "David");
        hashTable.put(3, "Harry");
        hashTable.remove(3);
        hashTable.put(3, "William");

        System.out.println(hashTable);
        System.out.println(hashTable.get(1));
    }

    public static int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }

        return hash % 100;
    }
}
