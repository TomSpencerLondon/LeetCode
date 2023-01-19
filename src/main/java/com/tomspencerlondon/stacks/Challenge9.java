package com.tomspencerlondon.stacks;

import java.util.Stack;

public class Challenge9 {
    // Check for balanced parentheses using a stack

    public static void main(String[] args) {
        String expression = "{[({})]}";
        System.out.println(isBalanced(expression));
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }


        return stack.isEmpty();
    }

}
