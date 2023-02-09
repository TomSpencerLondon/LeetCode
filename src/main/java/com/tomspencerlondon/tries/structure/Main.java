package com.tomspencerlondon.tries.structure;

public class Main {
    public static void main(String[] args) {
        TrieNode trieNode = new TrieNode();

        System.out.println("Children: " + trieNode.children[0]);
        System.out.println("Is end of Word: " + trieNode.isEndWord);
    }
}
