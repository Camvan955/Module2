package ss3_array_method_in_java.practice;

import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height * 2 - 1; j++) {
                if (j == (height + 1) - i || j == (height - 1) + i) {
                    if (i - 1 == 0) {
                        System.out.print(" ");

                    } else {
                        System.out.print(i - 1);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= height * 2 - 1; j++) {
                if (j == (height + 1) - i || j == (height - 1) + i) {
                    if (i - 1 == 0) {
                        System.out.print(" ");

                    } else {
                        System.out.print(i - 1);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
