package com.tomspencerlondon.stacks;

public class Challenge4 {
    // implement queue using a built in stack

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private static class Queue<T> {
        private Stack<T> stack;
        private Stack<T> tempStack;

        public Queue(int size) {
            this.stack = new Stack<>(size);
            this.tempStack = new Stack<>(size);
        }

        public void enqueue(T value) {
            stack.push(value);
        }

        public T dequeue() {
            if (isEmpty()) {
                return null;
            }

            if (!tempStack.isEmpty()) {
                return tempStack.pop();
            } else {
                while (!stack.isEmpty()) {
                    tempStack.push(stack.pop());
                }
            }


            return tempStack.pop();
        }

        public boolean isEmpty() {
            return stack.isEmpty() && tempStack.isEmpty();
        }
    }
}
