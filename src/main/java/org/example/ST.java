package org.example;

import java.util.NoSuchElementException;

public class ST<Key extends Comparable<Key>, Value> {

    private Node root;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    // create an ordered symbol table
    public ST() {
    }

    // put key-value pair into the table (remove key from table if value is null)
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("calls put() with null key");
        if (val == null) {
            delete(key);
            return;
        }
        // TODO: Implement recursive put logic here
    }

    // value paired with key (null if key is absent)
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("calls get() with null key");
        // TODO: Implement recursive search logic here
        return null;
    }

    // remove key (and its value) from table
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("calls delete() with null key");
        // TODO: Implement Hibbard deletion
    }

    // is there a value paired with key?
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("calls contains() with null key");
        return get(key) != null;
    }

    // is the table empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // number of key-value pairs
    public int size() {
        return size(root);
    }

    // utility method for size
    private int size(Node x) {
        if (x == null) return 0;
        else return x.size;
    }

    // smallest key
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("calls min() with empty symbol table");
        // TODO: Traverse left
        return null;
    }

    // largest key
    public Key max() {
        if (isEmpty()) throw new NoSuchElementException("calls max() with empty symbol table");
        // TODO: Traverse right
        return null;
    }

    // largest key less than or equal to key
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("calls floor() with null key");
        if (isEmpty()) throw new NoSuchElementException("calls floor() with empty symbol table");
        // TODO: Implement floor logic
        return null;
    }

    // smallest key greater than or equal to key
    public Key ceiling(Key key) {
        if (key == null) throw new IllegalArgumentException("calls ceiling() with null key");
        if (isEmpty()) throw new NoSuchElementException("calls ceiling() with empty symbol table");
        // TODO: Implement ceiling logic
        return null;
    }

    // number of keys less than key
    public int rank(Key key) {
        if (key == null) throw new IllegalArgumentException("calls rank() with null key");
        // TODO: Implement rank logic
        return 0;
    }

    // key of rank k
    public Key select(int k) {
        if (k < 0 || k >= size()) throw new IllegalArgumentException("argument to select() is invalid: " + k);
        // TODO: Implement select logic
        return null;
    }

    // delete smallest key
    public void deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        // TODO: Implement deleteMin
    }

    // delete largest key
    public void deleteMax() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        // TODO: Implement deleteMax
    }

    // number of keys in [lo..hi]
    public int size(Key lo, Key hi) {
        if (lo == null) throw new IllegalArgumentException("first argument to size() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to size() is null");
        if (lo.compareTo(hi) > 0) return 0;
        if (contains(hi)) return rank(hi) - rank(lo) + 1;
        else              return rank(hi) - rank(lo);
    }

    // keys in [lo..hi], in sorted order
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) throw new IllegalArgumentException("first argument to keys() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to keys() is null");
        // TODO: Implement range search using a Queue
        return null;
    }

    // all keys in the table, in sorted order
    public Iterable<Key> keys() {
        if (isEmpty()) return new java.util.LinkedList<>(); // or a custom Queue
        return keys(min(), max());
    }
}