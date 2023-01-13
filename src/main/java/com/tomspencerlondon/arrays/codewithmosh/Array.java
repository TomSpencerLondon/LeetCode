package com.tomspencerlondon.arrays.codewithmosh;

import java.util.Arrays;

public class Array {
    private int length;
    private int index;
    private int[] items;
    public Array(int length) {
        this.length = length;
        items = new int[length];
        index = 0;
    }

    public void insert(int data) {
        int[] newItems;
        if (index > (length - 1)) {
            length = index + 1;
            newItems = new int[length];

            for (int i = 0; i < index; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
            items[index++] = data;
        } else {
            items[index++] = data;
        }

    }

    public void removeAt(int index) {
        int removalIndex = 0;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                removalIndex = i;
            }
        }

        for (int i = removalIndex; i < length - 1; i++) {
            items[i] = items[i + 1];
        }
    }

    public int indexOf(int value) {
        int indexOf = -1;

        for (int i = 0; i < length; i++) {
            if (items[i] == value) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
