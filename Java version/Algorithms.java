class Algorithms {

    /////////////
    // Sorting //
    /////////////

    // Bubble sort (optimized): Swap the adjacent elements if they are in wrong order.
    // Time complexity: Best case: sorted array [O(n)] - Worst case: reversed array [O(n^2)].
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    // Insertion sort: Consider one element at a time and place this element in the correct order relative to those before it.
    // Time complexity: Best case: sorted array [O(n)] - Worst case: reversed array [O(n^2)].
    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // begin with second item
            int current = array[i];
            while (i > 0 && array[i - 1] > current) {
                array[i] = array[i - 1]; // move array[i - 1] rightwards
                i--;
            }
            array[i] = current;
        }
    }

    // Quick sort (optimized for worst case): A Divide and Conquer algorithm that picks an element as pivot and partitions the given array around the picked pivot.
    // The key process in quickSort is quickSortPartition(). It takes the last element of the array as pivot, places it at its correct position
    // in sorted array and places all smaller elements before it and all greater elements after it. All this is done in linear time.
    // Time complexity: Best case: When the middle element is picked as pivot > 𝛝(nLogn).
    //                  Average case: O(nLogn).
    //                  Worst case (with tail call optimization): O(Logn).
    static void quickSort(int[] array, int low, int high) {
        while (low < high) {
            int pivot = quickSortPartition(array, low, high);

            // If left part is smaller, recur for left part and handle right part iteratively.
            if (pivot - low < high - pivot) {
                quickSort(array, low, pivot - 1);
                low = pivot + 1;
            } else { // else recur for right part
                quickSort(array, pivot + 1, high);
                high = pivot - 1;
            }
        }
    }

    private static int quickSortPartition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Selection sort: Sort an array by repeatedly finding the minimum element (ascending order) from the unsorted part and place it at the beginning.
    // This algorithm maintains two subarrays in a given array, one that is already sorted and one remaining that is unsorted.
    // At each iteration, the minimum element from the unsorted subarray is moved to the sorted subarray.
    // Time complexity: Always O(n^2) since we have two nested loops.
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            // find minimum element in unsorted array
            int min = i; // min index of the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // swap the found minimum element with the first element of the array
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
