using System;

namespace DataStructures
{
    internal static class Program
    {
        public static void Main(string[] args)
        {
            int[] array = {6, 5, 3, 1, 8, 7, 2, 4, -4};

            Algorithms.InsertionSort(array);
            Algorithms.BubbleSort(array);
            Algorithms.QuickSort(array, 0, array.Length - 1);
            Algorithms.SelectionSort(array);

            for (var i = 0; i < array.Length - 1; i++)
            {
                Console.Write(array[i] + " ");
            }
            Console.WriteLine(array.Length - 1);
        }
    }
}
