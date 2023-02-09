package com.tomspencerlondon.tries.deletion;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public int getIndex(char t) {
        return t - 'a';
    }

    public void insert(String key) {
        if (key == null) {
            return;
        }

        key = key.toLowerCase();

        TrieNode currentNode = this.root;

        int index = 0;

        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));

            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }

            currentNode = currentNode.children[index];
        }

        currentNode.markAsLeaf();
    }

    public boolean search(String key) {
        if (key == null) {
            return false;
        }

        key = key.toLowerCase();

        TrieNode currentNode = this.root;

        int index = 0;

        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));

            if (currentNode.children[index] == null) {
                return false;
            }

            currentNode = currentNode.children[index];
        }

        return currentNode.isEndWord;
    }

    public void delete(String key) {
        if ((root == null) || (key == null)) {
            return;
        }

        deleteHelper(key, root, key.length(), 0);
    }

    private boolean deleteHelper(String key, TrieNode currentNode, int length, int level) {
        boolean deletedSelf = false;

        if (currentNode == null) {
            return deletedSelf;
        }

        if (level == length) {
            if (hasNoChildren(currentNode)) {
                currentNode = null;
                deletedSelf = true;
            } else {
                currentNode.unMarkAsLeaf();
                deletedSelf = false;
            }
        } else {
            TrieNode childNode = currentNode.children[getIndex(key.charAt(level))];

            boolean childDeleted = deleteHelper(key, childNode, length, level + 1);

            if (childDeleted) {
                currentNode.children[getIndex(key.charAt(level))] = null;

                if (currentNode.isEndWord) {
                    deletedSelf = false;
                } else if (!hasNoChildren(currentNode)) {
                    deletedSelf = false;
                } else {
                    currentNode = null;
                    deletedSelf = true;
                }
            } else {
                deletedSelf = false;
            }

        }
        return deletedSelf;
    }

    private boolean hasNoChildren(TrieNode currentNode) {
        for (int i = 0; i < currentNode.children.length; i++) {
            if (currentNode.children[i] != null) {
                return false;
            }
        }

        return true;
    }

}
