package ss16_io_file_text.exercise.esercise1.controllor;


import ss16_io_file_text.exercise.esercise1.service.IStudentService;
import ss16_io_file_text.exercise.esercise1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        while(true) {
            System.out.println("--------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý học viên ");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới học viên");
            System.out.println("2. Hiển thị danh sách học viên");
            System.out.println("3. Xóa học viên");
            System.out.println("4. Tìm kiếm học viên");
            System.out.println("5. Sắp xếp học viên");
            System.out.println("6. Thoát");
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5:
                    iStudentService.sortStudent();
                    break;
                case 6:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Nhập sai rồi!");

            }
        }
    }
}
