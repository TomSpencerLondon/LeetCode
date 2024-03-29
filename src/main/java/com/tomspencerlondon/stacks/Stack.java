package com.tomspencerlondon.stacks;

import java.util.Arrays;

public class Stack <V> {
    private int maxSize;
    private int currentSize;
    private int top;
    private V array[];

    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    Comment out the line below and execute again to see the warning.
    */
    @SuppressWarnings("unchecked")
    public Stack(int max_size) {
        this.currentSize = 0;
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
    }

    //returns the maximum size capacity
    public int getMaxSize() {
        return maxSize;
    }

    //returns true if Stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //returns true if Stack is full
    public boolean isFull(){
        return top == maxSize - 1;
    }

    //returns the value at top of Stack
    public V top(){
        return array[top];
    }

    //inserts a value to the top of Stack
    public void push(V value){
        if (!isFull()) {
            array[++top] = value;
        }
        currentSize++;
    }

    //removes a value from top of Stack and returns
    public V pop(){
        if (!isEmpty()) {
            return array[top--];
        }
        currentSize--;
        return null;
    }

    public int currentSize() {
        return currentSize;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

