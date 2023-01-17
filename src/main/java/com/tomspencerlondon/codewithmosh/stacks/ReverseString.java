package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String result = reverseString("abcd");
        System.out.println(result);
    }

    private static String reverseString(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
