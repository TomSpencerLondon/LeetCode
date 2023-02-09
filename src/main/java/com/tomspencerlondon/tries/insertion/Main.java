package com.tomspencerlondon.tries.insertion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their", "abc"};

        Trie t = new Trie();

        System.out.println("Keys to insert: " + Arrays.toString(keys) + "\n");

        for (int i = 0; i < keys.length; i++) {
            t.insert(keys[i]);
            System.out.println("\"" + keys[i] + "\"" + " Inserted.");
        }
    }
}
