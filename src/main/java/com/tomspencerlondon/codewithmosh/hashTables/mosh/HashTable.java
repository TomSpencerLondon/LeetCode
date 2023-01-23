package com.tomspencerlondon.codewithmosh.hashTables.mosh;
import java.util.Arrays;
import java.util.LinkedList;
public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "," + value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key);

        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        LinkedList<Entry> bucket = entries[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        int index = hash(key);

        LinkedList<Entry> bucket = entries[index];
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }

        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }


    public String toString() {
        return Arrays.toString(entries);
    }
}
