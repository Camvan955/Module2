package ss19_string_regex.exercise.exercise_plus.controller;

import ss19_string_regex.exercise.exercise_plus.service.IStudentService;
import ss19_string_regex.exercise.exercise_plus.service.ITeacherService;
import ss19_string_regex.exercise.exercise_plus.service.impl.StudentService;
import ss19_string_regex.exercise.exercise_plus.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class ManagerController {

    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService iStudentService = new StudentService();
    private static ITeacherService iTeacherService = new TeacherService();


    public static void menuManageData() throws IOException {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN VÀ HỌC VIÊN");
            System.out.println("Vui lòng nhập lựa chọn để thao tác với chương trình");
            System.out.println("1. Quản lý giảng viên");
            System.out.println("2. Quản lý học viên");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ManagerController.menuTeacher();
                    break;
                case 2:
                    ManagerController.menuStudent();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không khả thi");
            }
        }
    }


    public static void menuStudent() throws IOException {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý sinh viên");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Sắp xếp sinh viên");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayStudent();
                    break;
                case 4:
                    ManagerController.menuSearchStudent();
                    break;
                case 5:
                    iStudentService.sortStudent();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không khả thi");
            }
        }
    }

    public static void menuTeacher() throws IOException {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý giảng viên");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Hiển thị danh sách giảng viên");
            System.out.println("4. Tìm kiếm giảng viên");
            System.out.println("5. Sắp xếp giảng viên");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayTeacher();
                    break;
                case 4:
                    ManagerController.menuSearchStudent();
                    break;
                case 5:
                    iTeacherService.sortTeacher();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không khả thi");
            }

        }
    }

    public static void menuSearchStudent() throws IOException {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Tìm kiếm sinh viên");
            System.out.println("1. Tìm kiếm sinh viên theo tên");
            System.out.println("2. Tìm kiếm sinh viên theo id");
            System.out.println("3. Trở lại quản lý học sinh");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.searchStudentName();
                    break;
                case 2:
                    iStudentService.searchStudentId();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void menuSearchTeacher() throws IOException {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Tìm kiếm giảng viên");
            System.out.println("1. Tìm kiếm giảng viên theo tên");
            System.out.println("2. Tìm kiếm giảng viên theo id");
            System.out.println("3. Trỏ lại quản lý học sinh");
            System.out.print("Nhập lựa chọn của bạn: ");


            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.searchTeacherName();
                    break;
                case 2:
                    iTeacherService.searchTeacherId();
                    break;
                case 3:
                    return;
            }
        }
    }


}
