package com.tomspencerlondon.tries.deletion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] keys = {"the", "a", "there", "answer", "any", "by", "bye", "their", "abc"};

        String[] output = {"Not present in trie", "Present in trie"};

        Trie trie = new Trie();

        System.out.println("Keys: " + Arrays.toString(keys));

        for (int i = 0; i < keys.length; i++) {
            trie.insert(keys[i]);
        }

        if (trie.search("the")) {
            System.out.println("the --- " + output[1]);
            trie.delete("the");

            System.out.println("Deleted key \"the\"");
        } else {
            System.out.println("the --- " + output[0]);
        }

        if (trie.search("these")) {
            System.out.println("these --- " + output[1]);
            trie.delete("these");

            System.out.println("Deleted key \"these\"");
        } else {
            System.out.println("these --- " + output[0]);
        }

        if (trie.search("abc")) {
            System.out.println("abc --- " + output[1]);
            trie.delete("abc");

            System.out.println("Deleted key \"abc\"");
        } else {
            System.out.println("abc --- " + output[0]);
        }

        if (trie.search("abc")) {
            System.out.println("abc --- " + output[1]);
        } else {
            System.out.println("abc --- " + output[0]);
        }
    }
}
