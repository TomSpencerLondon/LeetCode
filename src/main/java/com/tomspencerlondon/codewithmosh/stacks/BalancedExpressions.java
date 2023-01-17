package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Stack;

public class BalancedExpressions {
    public static void main(String[] args) {
        String str = "(([1] + 2))[a]";

        System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (ch == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
