package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Stack;

public class BalancedExpressions {
    public static void main(String[] args) {
        String str = "((([1] - 1 + <2>)))[a]";

        System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '<' || ch == '[') {
                stack.push(ch);
            }

            if (ch == ')' || ch == '}' || ch == '>' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (isNotMatch(ch, top)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    private static boolean isNotMatch(char ch, char top) {
        return (ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == '>' && top != '<') ||
                (ch == '[' && top != '[');
    }
}
