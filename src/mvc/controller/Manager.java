package mvc.controller;

import mvc.service.IStudentService;
import mvc.service.ITeacherService;
import mvc.service.impl.StudentService;
import mvc.service.impl.TeacherService;

import java.util.Scanner;

public class Manager {
    public static Scanner scanner = new Scanner(System.in);
    public static void menuManager() {
        IStudentService iStudentService = new StudentService();
        ITeacherService iTeacherService = new TeacherService();
        while(true) {
            try{
                System.out.println("------------------------------------------------");
                System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN VÀ HỌC VIÊN");
                System.out.println("Vui lòng nhập lựa chọn để thao tác với chương trình");
                System.out.println("1. Quản lý giảng viên");
                System.out.println("2. Quản lý học viên");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn của bạn là: ");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        ManagerTeacher.menuTeacher();
                        break;
                    case 2:
                        ManagerStudent.menuStudent();
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
