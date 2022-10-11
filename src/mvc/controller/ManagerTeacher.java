package mvc.controller;

import mvc.service.ITeacherService;
import mvc.service.impl.TeacherService;

import java.util.Scanner;

public class ManagerTeacher {
    private static final ITeacherService iTeacherService = new TeacherService();
    static Scanner scanner = new Scanner(System.in);

    public static void menuTeacher() {

        while(true) {
            try {
                System.out.println("------------------------------------------------");
                System.out.println("Chương trình quản lý giảng viên");
                System.out.println("1. Thêm mới giảng viên");
                System.out.println("2. Xóa giảng viên");
                System.out.println("3. Hiển thị danh sách giảng viên");
                System.out.println("4. Tìm kiếm giảng viên");
                System.out.println("5. Sắp xếp giảng viên");
                System.out.println("6. Sửa giảng viên");
                System.out.println("7. Thoát");
                System.out.print("Lựa chọn của bạn là: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
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
                        iTeacherService.searchTeacherId();
                        break;
                    case 5:
                        iTeacherService.sortTeacher();
                        break;
                    case 6:
                        iTeacherService.editTeacher();
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
