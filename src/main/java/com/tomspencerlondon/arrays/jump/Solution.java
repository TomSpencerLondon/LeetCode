package com.tomspencerlondon.arrays.jump;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    private List<List<Integer>> paths = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();
    public int jump(int[] nums) {
        jumpAux(nums, 0);

        int min = Integer.MAX_VALUE;
        for (List<Integer> path : paths) {
            min = Math.min(path.size(), min);
        }

        return min - 1;
    }

    public void jumpAux(int[] numbers, int index) {
        stack.push(index);
        if (index >= numbers.length - 1) {
            Object[] s = stack.toArray();
            List<Integer> path = new ArrayList<>();
            for (Object current : s) {
                path.add((int) current);
            }
            paths.add(path);

            return;
        }

        for (int i = index + 1; i <= index + numbers[index]; i++) {
            if (i > numbers.length) {
                return;
            }
            jumpAux(numbers, i);
            stack.pop();
        }
    }
}
