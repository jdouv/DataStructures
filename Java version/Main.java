class Main {
    public static void main (String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4, -4};

        Algorithms.insertionSort(array);
        Algorithms.bubbleSort(array);
        Algorithms.quickSort(array, 0, array.length - 1);
        Algorithms.selectionSort(array);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array.length - 1);
    }
}