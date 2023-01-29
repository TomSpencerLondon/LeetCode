package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.tries;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("canada");
        System.out.println(trie.contains(null));
    }
}
