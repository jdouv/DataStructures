#ifndef DATA_STRUCTURES_ALGORITHMS_H
#define DATA_STRUCTURES_ALGORITHMS_H

class Algorithms {
public:
    static void bubbleSort(int array[], int arrayLength);
    static void insertionSort(int array[], int arrayLength);
    static void quickSort(int array[], int low, int high);
    static void selectionSort(int array[], int arrayLength);

private:
    static int quickSortPartition(int array[], int low, int high);
};

#endif