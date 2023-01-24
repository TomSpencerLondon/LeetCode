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
        Entry entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key)
                .add(new Entry(key, value));
    }

    public String get(int key) {
        Entry entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void remove(int key) {
        Entry entry = getEntry(key);

        if (entry == null) {
            throw new IllegalStateException();
        }

        getBucket(key).remove(entry);
    }

    private Entry getEntry(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }

        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        int index = hash(key);

        LinkedList<Entry> bucket = entries[index];
        if (bucket == null) {
            entries[index] = new LinkedList<>();
            bucket = entries[index];
        }

        return bucket;
    }

    private int hash(int key) {
        return key % entries.length;
    }


    public String toString() {
        return Arrays.toString(entries);
    }
}
