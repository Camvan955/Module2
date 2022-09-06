package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang can kiem tra: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + month + " co 31 ngay!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + month + " co 30 ngay");
                break;
            case 2:
                System.out.println("thang 2 co 28 hoac 29 ngay!");
                break;
            default:
                System.out.println("thang nhap vao khong hop le!");
                break;
        }

    }
}
