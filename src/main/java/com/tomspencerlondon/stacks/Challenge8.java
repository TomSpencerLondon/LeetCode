package com.tomspencerlondon.stacks;

import java.util.Stack;

public class Challenge8 {

    public static void main(String[] args) {
        // solve a celebrity problem using a stack

        int[][] party = new int[][]{
                {0,1,1,0},
                {1,0,1,1},
                {0,0,0,0},
                {0,1,1,0},
        };

        System.out.println(findCelebrity(party, 4));
    }

    public static int findCelebrity(int[][] party, int numPeople) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numPeople; i++) {
            stack.push(i);
        }

        int personA = stack.pop();
        int personB = stack.pop();

        while (stack.size() > 1) {
            if (knows(party, personA, personB)) {
                personA = stack.pop();
            } else {
                personB = stack.pop();
            }
        }

        int potentialCelebrity = stack.peek();

        if (knows(party, potentialCelebrity, personB)) {
            potentialCelebrity = personB;
        }

        if (knows(party, potentialCelebrity, personA)) {
            potentialCelebrity = personA;
        }

        for (int i = 0; i < numPeople; i++) {
            if (party[potentialCelebrity][i] == 1) {
                return -1;
            }
        }

       return potentialCelebrity;
    }

    public static boolean knows(int[][] party, int A, int B) {
        return party[A][B] == 1;
    }
}
