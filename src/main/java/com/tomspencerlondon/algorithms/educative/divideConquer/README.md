### Divide and Conquer
- Binary Search
- Quick Sort Algorithm
- Merge Sort


### Binary Search
- Binary Search is used on sorted arrays
- It follows divide and conquer strategy and the search space always reduces to half in every iteration
- Binary Search is efficient but the input array must be sorted

```java
class Main {
    
    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target > array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
    }
}
```

### Quick Sort
- in each recursive call, a pivot is chosen then the array is partitioned such that elements less
than pivot lie on the left and all elements greater than pivot are on the right
1. choose element as pivot
2. Move all numbers lower than pivot to the left and higher to the right
3. Recursively quicksort elements to left of pivot and elements to right of the pivot


```java

class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1};

        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = new Random().nextInt(end - start) + start;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, end);

        int leftPointer = partition(array, start, end, pivot);
        swap(array, leftPointer, end);

        quickSort(array, start, leftPointer - 1);
        quickSort(array, leftPointer + 1, end);
    }

    private static int partition(int[] array, int start, int end, int pivot) {
        int leftPointer = start;
        int rightPointer = end;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

```

### Merge Sort


