package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.tries;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();

//        trie.insert("cat");
//        trie.insert("canada");
//        System.out.println(trie.contains(null));

//        trie.insert("care");
//        trie.insert("car");
//        trie.remove("care");
//        trie.remove("book");
//        trie.remove(null);
//
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));

        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");

        List<String> words = trie.findWords(null);

        System.out.println(trie.countWords());
        System.out.println(words);

        System.out.println(Trie.longestCommonPrefix(new String[]{"Hello", "Hell", "Helsinki"}));
    }
}
