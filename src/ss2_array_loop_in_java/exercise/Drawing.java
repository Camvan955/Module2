package ss2_array_loop_in_java.exercise;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. In hinh chu nhat");
            System.out.println("2. In hinh tam giac vuong");
            System.out.println("3. In hinh tan giac can");
            System.out.println("Thoat");
            System.out.print("Nhap lua chon cua ban: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    System.out.println();

                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    System.out.println();

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 5; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 1; i <= 5; i++) {
                        for (int k = 5; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }

    }
}
