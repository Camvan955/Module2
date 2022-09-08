package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng các phần tử trong mảng: ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng vừa nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        int index = minValue(array);
        System.out.println("\nGiá trị nhỏ nhất trong mảng là:  " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
