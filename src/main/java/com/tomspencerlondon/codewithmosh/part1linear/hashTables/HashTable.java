package com.tomspencerlondon.codewithmosh.part1linear.hashTables;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

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

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException();
        }

        int bucketIndex = bucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    private int bucketIndex(K key) {
        return Math.abs(key.hashCode() % numOfBuckets);
    }

    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        int bucketIndex = bucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }

            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        int bucketIndex = bucketIndex(key);
        HashNode head = buckets[bucketIndex];

        HashNode previous = null;

        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }

            previous = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return (V) head.value;
    }

    @Override
    public String toString() {
        HashNode[] printable = Arrays.stream(buckets.clone())
                .filter(Predicate.not(Objects::isNull)).toArray(HashNode[]::new);
        return Arrays.toString(printable);
    }
}
