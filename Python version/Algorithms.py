##########
# Sorting
##########


# Bubble sort (optimized): Swap the adjacent elements if they are in wrong order.
# Time complexity: Best case: sorted array [O(n)] - Worst case: reversed array [O(n^2)].
def bubble_sort(array):
    for i in range(len(array)):
        swapped = False
        for j in range(0, len(array) - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]
                swapped = True

        if not swapped:
            break


# Insertion sort: Consider one element at a time and place this element in the correct order relative to those before
# it.
# Time complexity: Best case: sorted array [O(n)] - Worst case: reversed array [O(n^2)].
def insertion_sort(array):
    for i in range(1, len(array)):  # begin with second item
        current = array[i]
        while i > 0 and array[i - 1] > current:
            array[i] = array[i - 1]  # move array[i - 1] rightwards
            i -= 1

        array[i] = current


# Quick sort (optimized for worst case): A Divide and Conquer algorithm that picks an element as pivot and partitions
# the given array around the picked pivot.
# The key process in quickSort is quick_sort_partition(). It takes the last element of the array as pivot, places it at
# its correct position
# in sorted array and places all smaller elements before it and all greater elements after it. All this is done in
# linear time.
# Time complexity: Best case: When the middle element is picked as pivot > 𝛝(nLogn).
#                  Average case: O(nLogn).
#                  Worst case (with tail call optimization): O(Logn).
def quick_sort(array, low, high):
    while low < high:
        pivot = quick_sort_partition(array, low, high)

        # If left part is smaller, recur for left part and handle right part iteratively.
        if pivot - low < high - pivot:
            quick_sort(array, low, pivot - 1)
            low = pivot + 1
        else:  # else recur for right part
            quick_sort(array, pivot + 1, high)
            high = pivot - 1


def quick_sort_partition(array, low, high):
    pivot = array[high]
    i = (low - 1)  # index of smaller element

    for j in range(low, high):
        # If current element is smaller than or equal to pivot
        if array[j] <= pivot:
            i += 1

            # Swap array[i] and array[j]
            array[i], array[j] = array[j], array[i]

    # Swap array[i + 1] and array[high] (or pivot)
    array[i + 1], array[high] = array[high], array[i + 1]

    return i + 1


# Selection sort: Sort an array by repeatedly finding the minimum element (ascending order) from the unsorted part and
# place it at the beginning.
# This algorithm maintains two subarrays in a given array, one that is already sorted and one remaining that is
# unsorted.
# At each iteration, the minimum element from the unsorted subarray is moved to the sorted subarray.
# Time complexity: Always O(n^2) since we have two nested loops.
def selection_sort(array):
    for i in range(len(array)):

        # find minimum element in unsorted array
        minimum = i  # minimum index of the array
        for j in range(i + 1, len(array)):
            if array[j] < array[minimum]:
                minimum = j

        # swap the found minimum element with the first element of the array
        array[minimum], array[i] = array[i], array[minimum]
