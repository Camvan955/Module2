package ss3_array_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        size = Integer.parseInt(scanner.nextLine());

        // nhập các giá trị cho phần tử của mảng.
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        // in ra mảng đã nhập
        System.out.print("mảng đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        // nhập số cần chèn
        System.out.print("\nNhập vào số cần chèn: ");
        int X = Integer.parseInt(scanner.nextLine());

        // nhập vào vị trí cần chèn trong mảng
        System.out.print("Nhập vào vị trí cần chèn: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Vị trí nhập vào không chèn được!");
        } else {
            for (int j = array[index]; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = X;
        }
        System.out.println("Mảng sau khi chèn vào là: " + Arrays.toString(array));
    }
}
