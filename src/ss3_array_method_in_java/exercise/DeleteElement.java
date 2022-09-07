package ss3_array_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size, indexDel = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang: ");
        size = Integer.parseInt(scanner.nextLine());

        // nhập các giá trị cho phần tử của mảng.
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        // in ra mảng đã nhập
        System.out.print("Mang da nhap: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        // nhap vao phan tu can xoa
        System.out.print("\nNhap vao phan tu can xoa: ");
        int N = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < array.length; j++) {
            if (N == array[j]) {
                for (int k = j; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}