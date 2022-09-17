package ss_exercise_plus.esercise1.service.impl;

import ss_exercise_plus.esercise1.model.Teacher;
import ss_exercise_plus.esercise1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService<flagDelete> implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.inforTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập mã giảng viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.print("Bạn có chắc muốn xóa giảng viên này không? Y: có - N: không");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    teacherList.remove(i);
                    System.out.println("Xóa giảng viên thành công");
                }
                flagDelete = true;
                break;
            }
        }
    }
        public Teacher inforTeacher() {
        System.out.print("Nhập mã giảng viên: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh giảng viên: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính giảng viên: ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.print("Nhập chuyên ngành của giảng viên: ");
        String technique = scanner.nextLine();
        Teacher teacher = new Teacher(code, name, dateOfBirth, gender, technique);

        return teacher;

    }
}
