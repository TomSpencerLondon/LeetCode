package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String result = reverseString("abcd");
        System.out.println(result);

        String reversed = reverseToIndex("abcdefghijk", 3);

        System.out.println(reversed);
    }

    private static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static String reverseToIndex(String input, int index) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            stack.push(input.charAt(i));
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.append(input.substring(index + 1));

        return result.toString();
    }
}
