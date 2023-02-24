package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge7.twinkle;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-5,-3,0,1,3,3,3,4,5};
        int s = 3;

        System.out.println(calcFreq(arr, s));
    }

    private static int calcFreq(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                int left = mid;
                int right = mid;
                while (left >= 0 && arr[left] == key) {
                    count++;
                    left--;
                }

                while (right < arr.length && arr[right] == key) {
                    count++;
                    right++;
                }

                return count - 1;
            } else if (key > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
