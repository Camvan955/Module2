package mvc.controller;

import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.Scanner;

public class ManagerStudent {
    private static final IStudentService iStudentService = new StudentService();
    static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {

        while(true) {
            try {
                System.out.println("------------------------------------------------");
                System.out.println("Chương trình quản lý sinh viên");
                System.out.println("1. Thêm mới sinh viên");
                System.out.println("2. Xóa sinh viên");
                System.out.println("3. Hiển thị danh sách sinh viên");
                System.out.println("4. Tìm kiếm sinh viên");
                System.out.println("5. Sắp xếp sinh viên");
                System.out.println("6. Sửa học sinh");
                System.out.println("7. Thoát");
                System.out.print("Lựa chọn của bạn là: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
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
                        iStudentService.searchStudentId();
                        break;
                    case 5:
                        iStudentService.sortStudent();
                        break;
                    case 6:
                        iStudentService.editStudent();
                        break;
                    case 7:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
