package ss15_exception_debug.practice.practice2;

import java.util.Random;
import java.util.Scanner;

public class ArrayTestException {

    public Integer[] createRandom() {

        Random rd = new Random();
        Integer[] arr = new Integer[10];
        System.out.print("Nhập vào phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayTestException arrayTestException = new ArrayTestException();
        Integer[] arr = arrayTestException.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập phần tử ở vị trí bất kì: ");
        int x = Integer.parseInt(sc.nextLine());

//        try {

            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println("Chỉ số vượt quá giới hạn của mảng");
//        }
    }

}
