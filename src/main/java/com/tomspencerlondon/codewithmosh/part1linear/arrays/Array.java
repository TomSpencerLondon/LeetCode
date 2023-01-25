package com.tomspencerlondon.codewithmosh.part1linear.arrays;

import java.util.HashSet;
import java.util.Set;

public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        resizeIfRequired();

        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }

        resizeIfRequired();

        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        items[index] = item;
        count++;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
    }

    public void reverse() {
        int[] newItems = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[items.length - 1 - i];
        }

        items = newItems;
    }

    public int max() {
        int max = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }

        return max;
    }

    public int[] intersection(Array array) {
        int[] temp = new int[array.count + items.length];
        int index = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < array.count; j++) {
                if (items[i] == array.items[j] && !set.contains(items[i])) {
                    temp[index++] = items[i];
                    set.add(items[i]);
                }
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
