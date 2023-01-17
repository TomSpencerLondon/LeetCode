package com.tomspencerlondon.stacks;

public class Challenge2 {
    public static void main(String[] args) {
        // Implement Two Stacks using one Array

        TwoStacks<Integer> stacks = new TwoStacks<Integer>(4);
        stacks.push1(1);
        stacks.push2(2);
        stacks.push2(3);

        System.out.println(stacks.pop1());
        System.out.println(stacks.pop2());
    }

    private static class TwoStacks<V> {
        V[] items;

        int top1;
        int top2;

        public TwoStacks(int size) {
            this.items = (V[]) new Object[size];
            this.top1 = -1;
            this.top2 = items.length;
        }

        public void push1(V value) {
            if (top1 > top2 - 1) {
                throw new StackOverflowError();
            }

            items[++top1] = value;
        }

        public void push2(V value) {
            if (top1 > top2 - 1) {
                throw new StackOverflowError();
            }

            items[--top2] = value;
        }

        public V pop1() {
            if (top1 < 0) {
                throw new IllegalStateException();
            }

            return items[top1--];
        }

        public V pop2() {
            if (top2 > items.length - 1) {
                throw new IllegalStateException();
            }

            return items[top2++];
        }
    }
}
