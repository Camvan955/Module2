package ss_exercise_plus.esercise1.controllor;

import ss_exercise_plus.esercise1.service.ITeacherService;
import ss_exercise_plus.esercise1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static ITeacherService iTeacherService = new TeacherService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuTeacher() {
        while(true) {
            System.out.println("--------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý giảng viên ");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Hiển thị danh sách giảng viên");
            System.out.println("3. Xóa giảng viên");
            System.out.println("4. Thoát");
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayTeacher();
                    break;
                case 3:
                    iTeacherService.removeTeacher();
                    break;
                case 4:
                    return;

            }
        }

    }
}
