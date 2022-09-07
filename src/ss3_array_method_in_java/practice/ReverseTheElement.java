package ss3_array_method_in_java.practice;

import java.util.Scanner;

public class ReverseTheElement {
    // đảo ngược các phần tử của mảng (mảng có tối đa 20 phần tử)

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap vao do dai mang: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.print("mang co do dai lon hon 20 roi!");
            }
        } while (size > 20);

        // nhập các giá trị cho phần tử của mảng.
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap phan tu thứ " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        // in ra mảng đã nhập
        System.out.printf("\n%-20s", "Mang da nhap: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //đảo ngược thứ tự các phần tử trong mảng.
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - j - 1];
            array[size - j - 1] = temp;
        }
        // in ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s", "Mang sau khi da dao nguoc: " );
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }
    }
}
