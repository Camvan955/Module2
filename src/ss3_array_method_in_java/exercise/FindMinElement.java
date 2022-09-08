package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        size = scanner.nextInt();

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Các phần tử có trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nGiá trị nhỏ nhất của mảng: " + min + " ,o vi tri thu: " + index);
    }
}
