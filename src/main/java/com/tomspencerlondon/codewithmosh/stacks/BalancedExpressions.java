package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Stack;

public class BalancedExpressions {
    public static void main(String[] args) {
        String str = "(((([1] - 1 + <2>)))[a]";

        System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '<' || ch == '[') {
                stack.push(ch);
            }

            if (ch == ')') {
                if (isEmpty(stack)) return false;

                if (stack.peek() == '(') {
                    stack.pop();
                }
            } else if (ch == '}') {
                if (isEmpty(stack)) return false;

                if (stack.peek() == '{') {
                    stack.pop();
                }
            } else if (ch == '>') {
                if (isEmpty(stack)) return false;

                if (stack.peek() == '<') {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (isEmpty(stack)) return false;

                if (stack.peek() == '[') {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }

    private static boolean isEmpty(Stack<Character> stack) {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
