package ss15_exception_debug.exercise.exercise2.esercise1.controllor;

import java.util.Scanner;

public class PersonController {

    public static Scanner scanner = new Scanner(System.in);
    public static void menuPerson(){
        while(true) {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN VÀ HỌC VIÊN ");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Quản lí giảng viên");
            System.out.println("2. Quản lí học viên");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    TeacherController.menuTeacher();
                    break;
                case 2:
                    StudentController.menuStudent();
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhập sai rồi!");
            }
        }
    }


}

