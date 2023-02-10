package com.tomspencerlondon.tries.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their","abc"};
        String output[] = {"Not present in trie", "Present in trie"};
        Trie t = new Trie();

        System.out.println("Keys: "+ Arrays.toString(keys));

        // Construct trie

        for (int i = 0; i < keys.length ; i++)
            t.insert(keys[i]);


        List<String> list = findWords(t.getRoot());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static List<String> findWords(TrieNode root) {
        List<String> result = new ArrayList<>();
        char[] charArray = new char[20];

        getWords(root, result, 0, charArray);
        return result;
    }

    private static void getWords(TrieNode root, List<String> result, int level, char[] charArray) {
        if (root.isEndWord) {
            String temp = "";

            for (int x = 0; x < level; x++) {
                temp += Character.toString(charArray[x]);
            }

            result.add(temp);
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                charArray[level] = (char) (i + 'a');
                getWords(root.children[i], result, level + 1, charArray);
            }
        }
    }
}
