package ss13_search_algorithm.exercise.search_binari_deque;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            size = Integer.parseInt(sc.nextLine());
        }
        while (size < 0);

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

//        System.out.println(Arrays.toString(arr));

        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi đã sắp xếp: " + Arrays.toString(arr));
        System.out.print("Nhập số cần tìm vị trí: ");
        int value = Integer.parseInt(sc.nextLine());
        int index = binarySearch(arr, 0, arr.length - 1, value);
        System.out.println("Vị trí của số cần tìm: " + index);
    }


    static int binarySearch(int[] arr, int left, int right, int value) {
//        System.out.println("Nhập vào giá trị cần tìm");
        int mid = (left + right / 2);
        if (left > right) {
            return -1;
        }
        if (value == arr[mid]) {
            return mid;
        }
        if (arr[mid] < value) {
            left = mid + 1;
        } else if (arr[mid] > value) {
            right = mid - 1;
        }

        return binarySearch(arr, left, right, value);
    }

}

