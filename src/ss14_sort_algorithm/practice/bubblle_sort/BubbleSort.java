package ss14_sort_algorithm.practice.bubblle_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng vừa nhập vào là: " + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Mảng sau khi đã sắp sếp là: " + Arrays.toString(arr));

    }
    
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                System.out.println("Hoán đổi vị trí " + arr[j] + " và " + arr[j+1]);
                if( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
