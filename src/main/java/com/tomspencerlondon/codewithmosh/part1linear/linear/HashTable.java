package com.tomspencerlondon.codewithmosh.part1linear.linear;

public class HashTable {
    private int capacity;
    String values[];
    String keys[];

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.values = new String[capacity];
        this.keys = new String[capacity];
    }

    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }

        return sum % capacity;
    }

    public void put(String key, String value) {
        int keyHash;
        int index = 0;

        while (index < capacity - 1) {
            keyHash = (hash(key) + 1) % capacity;
            if (values[keyHash] == null) {
                values[keyHash] = value;
                keys[keyHash] = key;
                break;
            }

            if (values[keyHash] != null && keys[keyHash].equals(key)) {
                values[keyHash] = value;
                break;
            }
            index++;
        }

    }

    public String get(String key) {
        int index = 0;
        int keyHash = (hash(key) + index) % capacity;

        while (values[keyHash] != null && index < capacity) {
            if (keys[keyHash].equals(key)) {
                return values[keyHash];
            }
            index++;
            keyHash = (hash(key) + index) % capacity;
        }

        return null;
    }

    public void remove(String key) {
        int index = 0;
        int keyHash = (hash(key) + index) % capacity;
        while (keys[keyHash] != null && index < capacity) {
            if (keys[keyHash].equals(key)) {
                keys[keyHash] = null;
                values[keyHash] = null;
                return;
            }

            index++;
            keyHash = (hash(key) + index) % capacity;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < keys.length; i++) {
            result.append(keys[i] + "," + values[i] + "\n");
        }

        return result.toString();
    }


}
