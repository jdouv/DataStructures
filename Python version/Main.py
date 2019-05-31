from Algorithms import *

array = [6, 5, 3, 1, 8, 7, 2, 4, -4]

insertion_sort(array)
bubble_sort(array)
quick_sort(array, 0, len(array) - 1)
selection_sort(array)

for i in range(len(array)):
    print(array[i], end=" ")
