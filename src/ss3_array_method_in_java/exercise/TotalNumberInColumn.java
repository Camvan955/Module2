package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class TotalNumberInColumn {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //tính tổng các số của một cột trong mảng có sẵn
//        int[][] array = {{1, 2, 12}, {4, 5, 6}, {7, 8, 9}};
//
//        System.out.println("Nhập số cột muốn tính tổng: ");
//        Scanner scanner = new Scanner(System.in);
//        int columnNumber = Integer.parseInt(scanner.nextLine());
//        int total = 0;
//        for (int i = 0; i < array[0].length; i++) {
//            total += array[i][columnNumber];
//        }
//        System.out.println("Tổng của cột " + columnNumber + " là: " + total);


        // tính tổng các số của cột trong mảng với mảng người dùng nhập vào
        int[][] array = taoMang2Chieu();

        System.out.println("Nhập số cột muốn tính tổng: ");
        int columnNumber = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 0; i < array[0].length; i++) {
            total += array[i][columnNumber];
        }
        System.out.println("Tổng của cột " + columnNumber + " là: " + total);
    }

    public static int[] CreateOneDimensionalArray() {
        System.out.println("Nhập độ dài của mảng: ");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ" + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public static int[][] taoMang2Chieu() {
        System.out.println("Nhập vào độ dài của mảng 2 chiều: ");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[lengthArray][];
        for (int i = 0; i < array.length; i++) {
            array[i]= CreateOneDimensionalArray();
        }
        return array;

    }
}

