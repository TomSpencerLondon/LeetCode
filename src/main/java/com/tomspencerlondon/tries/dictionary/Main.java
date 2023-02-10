package com.tomspencerlondon.tries.dictionary;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        // Input dict (use only 'a' through 'z' and lower case)
        String dict[] = {"the", "hello", "there", "answer","any", "dragon", "world", "their",  "inc"};

        Trie t = new Trie();

        System.out.println("Keys: "+ Arrays.toString(dict));

        if(isFormationPossible(dict, "incany"))
            System.out.println("true");
        else
            System.out.println("false");

    }

    private static boolean isFormationPossible(String[] dict, String word) {
        if (word.length() < 2 || dict.length < 2) {
            return false;
        }

        Trie trie = new Trie();

        for (int i = 0; i < dict.length; i++) {
            trie.insert(dict[i]);
        }

        for (int i = 0; i < word.length(); i++) {
            String first = word.substring(0, i);
            String second = word.substring(i, word.length());

            if (trie.search(first) && trie.search(second)) {
                return true;
            }
        }

        return false;
    }
}
