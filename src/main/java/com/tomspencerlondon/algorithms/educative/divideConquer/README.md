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
    public static int quickSort(int[] array, int start, int end) {
        int pivotIndex = 0;
        if (start < end) {
            pivotIndex = partition(array, start, end);
        }
        
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }
}
```



