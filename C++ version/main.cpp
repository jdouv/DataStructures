#include <iostream>
#include "Algorithms.h"
using namespace std;

int main() {
    int array[] {6, 5, 3, 1, 8, 7, 2, 4, -4};
    int arrayLength = sizeof(array)/sizeof(array[0]);

    Algorithms::bubbleSort(array, arrayLength);
    Algorithms::insertionSort(array, arrayLength);
    Algorithms::quickSort(array, 0, arrayLength - 1);
    Algorithms::selectionSort(array, arrayLength);

    for (int i = 0; i < arrayLength - 1; i++) {
        cout << array[i] << " ";
    }
    cout << array[arrayLength - 1] << endl;

    return 0;
}