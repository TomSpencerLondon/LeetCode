package com.tomspencerlondon.stringpractice;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        // Decode a string
//        3[a2[c]]
//        accaccacc
//        2[abc]3[cd]ef

//        stack:
//
//        3[ab2[cb]]
//        1[abc1[de]3[ab2[cb]]]
//        abcdeabcbcb


//        3[a2[c]]
//        accacc
//       12[ab]

//3[a2[c]]
//2[abc]3[cd]ef
//12[ab]

        System.out.println(decode("12[ab]"));
        System.out.println(decode("3[a2[c]]"));
    }

    public static String decode(String input) {
        Stack<String> wordStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        int count = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count = 10 * count + (c - '0');
            } else if (Character.isLetter(c)) {
                word.append(c);
            } else if (c == '['){
                countStack.push(count);
                wordStack.push(word.toString());
                word = new StringBuilder();
                count = 0;
            } else {
                StringBuilder duplicatedWord = new StringBuilder(wordStack.pop());
                count = countStack.pop();

                for (int j = 0; j < count; j++) {
                    duplicatedWord.append(word);
                }
                word = duplicatedWord;
            }
        }

        return word.toString();
    }
}
