package ss14_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort2 {
    static int[] arr = {4, 2, 6, 5, 9, 2, 7};

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println("Mảng sau khi được sắp xếp là: " + Arrays.toString(arr));
    }


}
