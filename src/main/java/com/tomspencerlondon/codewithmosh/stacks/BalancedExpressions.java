package com.tomspencerlondon.codewithmosh.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressions {

    private static final List<Character> rightBrackets =
            Arrays.asList(')', '}', '>', ']');
    private static final List<Character> leftBrackets =
            Arrays.asList('(', '{', '<', '[');

    public static void main(String[] args) {
        String str = "((([1] - 1 + <2>)))[a]";

        System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!isMatch(top, ch)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    private static boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private static boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private static boolean isMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
