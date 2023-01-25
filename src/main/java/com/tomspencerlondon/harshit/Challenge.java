package com.tomspencerlondon.harshit;

import java.util.Stack;

public class Challenge {
    public static void main(String[] args) {
        // Agenda:
//        - What is the problem?
//        Questions
//        Problem - how to solve
//        Discuss on algorithms
//        1 / 2 algorithms
//        Best coding practices
//        Problem:
//        Check for Balanced Parentheses using a Stack

//        { }, [ ], ( ), < >
//        { [ () <> ]}
//        { < ] }
//        { <> ] }
//        [ ] () <

        String input = "{ [ () <> ]}";
        String input2 = "[ ] () <";

        System.out.println(isBalanced(input2));

    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            switch (c) {
                case '{', '[', '<', '(' -> stack.push(c);
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                }
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
                case '>' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '<') {
                        stack.pop();
                    }
                }
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
        }

        return stack.isEmpty();
    }


}
