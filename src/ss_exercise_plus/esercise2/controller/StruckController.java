package ss_exercise_plus.esercise2.controller;

import java.util.Scanner;

public class StruckController {
    static Scanner sc = new Scanner(System.in);

    public static void menuTransport(){
        while(true) {
            System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ GIAO THÔNG");
            System.out.println("1. Xe tải");
            System.out.println("2. Xe con");
            System.out.println("3.Xe máy");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
//                    StruckController.menuStruck();
            }
        }
    }
}
