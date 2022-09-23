package ss14_sort_algorithm.practice.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    static double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                double temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Mảng sau khi sắp sếp là: " + Arrays.toString(arr));
    }

}
