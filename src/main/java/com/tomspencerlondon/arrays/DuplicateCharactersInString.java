package com.tomspencerlondon.arrays;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        System.out.println(duplicates("How many duplicates are there?"));
    }

    private static int duplicates(String sentence) {
        String lowercaseSentence = sentence.toLowerCase();
        StringBuilder characters = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(lowercaseSentence.charAt(i));
            if (characters.toString().contains(current) && !duplicates.toString().contains(current)) {
                duplicates.append(current);
            }

            characters.append(current);
        }

        return duplicates.length();
    }
}
