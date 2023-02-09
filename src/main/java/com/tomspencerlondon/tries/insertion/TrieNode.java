package com.tomspencerlondon.tries.insertion;

public class TrieNode {
    TrieNode[] children;

    boolean isEndWord;
    static final int ALPHABET_SIZE = 26;

    TrieNode() {
        this.isEndWord = false;
        this.children = new TrieNode[ALPHABET_SIZE];
    }

    public void markAsLeaf() {
        this.isEndWord = true;
    }

    public void unMarkAsLeaf() {
        this.isEndWord = false;
    }
}
