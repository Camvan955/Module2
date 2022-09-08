package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class FindMaxTwoDimensionalArray {
    //  public static void main(String[] args) {
//        int[][] array = {{1, 2, 12}, {4, 5, 6}, {7, 8, 9}};
//        float max = array[0][0];
//        int indexI = 0, indexJ = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    indexI = i;
//                    indexJ = j;
//                }
//            }
//        }
//        System.out.println("phan tu lon nhat tim duoc la: " + array[indexI][indexJ]);
//    }
//}


    public static void main(String[] args) {

        //khai báo số dòng số cột
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng: ");
        int numberRow = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của mảng: ");
        int numberColumn = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[numberRow][numberColumn];

        // Nhập vào giá trị các phần tử trong mảng
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // hiển thị mảng vừa nhập
        System.out.println("\nMảng vừa nhập: ");
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }

        // tìm phần tử lớn nhất trong mảng vừa nhập vào
        float max = array[0][0];
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("\nPhần tử lớn nhất tìm được trong mảng là: " + array[indexI][indexJ]);
    }

}
