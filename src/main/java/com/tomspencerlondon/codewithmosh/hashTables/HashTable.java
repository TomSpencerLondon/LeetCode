package com.tomspencerlondon.codewithmosh.hashTables;

public class HashTable<K, V> {
    // HashTable
    // put(k, v)
    // get(k): v
    // remove(k)
    // k: int
    // v: string
    // Collisions: chaining
    // LinkedList<Entry>[]
    // [LL, LL, LL, LL]

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        this(10);
    }
    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[capacity];
        this.size = 0;
    }

    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value) {
    }

    public V get(K key) {
        return null;
    }

    public V remove(K key) {
        return null;
    }
}
