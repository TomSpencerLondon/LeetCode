package com.tomspencerlondon.stacks;

public class Challenge6 {
    // Evaluate postfix expressions using stacks

    public static void main(String[] args) {
        String expression = "6 3 8 * + 4 -";
        int number = evaluatePostfix(expression);

        System.out.println(number);
    }

    public static int evaluatePostfix(String input) {
        Stack<Integer> stack = new Stack<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (Character.isDigit(character)) {
                stack.push(Character.getNumericValue(character));
            } else if (!Character.isWhitespace(character)){
                int b = stack.pop();
                int a = stack.pop();

                if (character == '+') {
                    stack.push(a + b);
                } else if (character == '-') {
                    stack.push(a - b);
                } else if (character == '*') {
                    stack.push(a * b);
                } else if (character == '/') {
                    stack.push(a / b);
                }
            }
        }

        if (stack.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return stack.pop();
        }
    }
}
