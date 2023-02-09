package com.tomspencerlondon.tries.count;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public int getIndex(char t) {
        return t - 'a';
    }

    public TrieNode getRoot() {
        return root;
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

        for (int level = 0; level < key.length(); level++) {
            int index = getIndex(key.charAt(level));

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
            //If there are no nodes ahead of this node in this path
            //Then we can delete this node
            if (hasNoChildren(currentNode)) {
                currentNode = null;
                deletedSelf = true;
            }
            //If there are nodes ahead of currentNode in this path
            //Then we cannot delete currentNode. We simply unmark this as leaf
            else {
                currentNode.unMarkAsLeaf();
                deletedSelf = false;
            }
        } else {
            TrieNode childNode = currentNode.children[getIndex(key.charAt(level))];
            boolean childDeleted = deleteHelper(key, childNode, length, level + 1);
            if (childDeleted) {
                //Making children pointer also null: since child is deleted
                currentNode.children[getIndex(key.charAt(level))] = null;
                //If currentNode is leaf node that means currntNode is part of another key
                //and hence we can not delete this node and it's parent path nodes
                if (currentNode.isEndWord) {
                    deletedSelf = false;
                }
                //If childNode is deleted but if currentNode has more children then currentNode must be part of another key.
                //So, we cannot delete currenNode
                else if (!hasNoChildren(currentNode)) {
                    deletedSelf = false;
                }
                //Else we can delete currentNode
                else {
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
            if ((currentNode.children[i]) != null) {
                return false;
            }
        }

        return true;
    }
}
