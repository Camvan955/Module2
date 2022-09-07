package ss2_array_loop_in_java.practice;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a = input.nextInt();
        System.out.println("Nhap vao so b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || a == 0) {
            System.out.println("Khong co uoc chung lon nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc chung lon nhat la: " + a);
    }
}
