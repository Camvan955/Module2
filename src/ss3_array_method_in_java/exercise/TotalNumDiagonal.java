package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class TotalNumDiagonal {

    //tính tổng các số trong đường chéo chính với mảng có sẵn
    public static void main(String[] args) {
//        int[][] array = {{1, 2, 12}, {4, 5, 6}, {7, 8, 9}};
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i][i];
//        }
//        System.out.println("Tổng các số ở đường chéo chính là: " + sum);
//    }


        //tính tổng các số trong đường chéo chính với mảng nhập vào từ bàn phím

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng: ");
        int numberRow = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của mảng: ");
        int numberColumn;
        do {
            numberColumn = Integer.parseInt(scanner.nextLine());
            if (numberColumn != numberRow) {
                System.out.println("Nhập lại số cột bằng số dòng: ");
            }
        } while (numberColumn != numberRow);

        int[][] array = new int[numberRow][numberColumn];


        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nMảng vừa nhập: ");
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("\nTổng các số ở đường chéo chính là: " + sum);
    }
}