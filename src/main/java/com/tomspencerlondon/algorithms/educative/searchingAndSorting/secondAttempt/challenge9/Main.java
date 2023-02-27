package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge9;

public class Main {

    public static void main(String[] args) {
       String[] array = {"", "educative", "", "", "",  "hello", "", "learning", "world", "", "", ""};

       String target = "educative";

        System.out.println(searchForString(array, target));
    }


    public static int searchForString(String[] array, String target) {
        return modifiedBinarySearch(array, 0, array.length - 1, target);
    }

    private static int modifiedBinarySearch(String[] array, int low, int high, String target) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (array[mid] == "") {
            int left = mid - 1;
            int right = mid + 1;

            while (true) {
                if (left < low && right > high) {
                    return -1;
                }

                if (left >= low && array[left] != "") {
                    mid = left;
                    break;
                } else if (left <= high && array[right] != "") {
                    mid = right;
                    break;
                }

                left--;
                right++;
            }
        }

        if (array[mid].equals(target)) {
            return mid;
        } else if (array[mid].compareTo(target) > 0) {
            return modifiedBinarySearch(array, low, mid - 1, target);
        } else {
            return modifiedBinarySearch(array, mid + 1, high, target);
        }
    }
}
