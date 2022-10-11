package demo.controller;

import demo.utils.ExceptionUtils;

import java.util.Scanner;

public class AnimalController {
    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("========================================================");
                System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ANIMAL");
                System.out.println("1. QUản lý mèo");
                System.out.println("2. Quản lý chó");
                System.out.println("3. Thoát chương trình");
                System.out.print("Vui lòng chọn chức năng theo số. Lựa chọn của bạn là: ");
                int choice = Integer.parseInt(scanner.nextLine());

                ExceptionUtils.CheckInput(choice);
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        System.exit(0);
                }
            } catch (ExceptionUtils | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
