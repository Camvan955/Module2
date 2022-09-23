package ss_exercise_plus.esercise1.service.impl;

import ss_exercise_plus.esercise1.model.Student;
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

    @Override
    public void searchTeacher() {
        int choice;
        System.out.print("Nhập tùy chọn: 1: tìm theo tên giảng viên - 2: tìm theo mã giảng viên: \t");
        choice = Integer.parseInt(scanner.nextLine());
//        if (choice == 1) {
//            System.out.print("Nhập tên giảng viên: ");
//            String nameTeacher = scanner.nextLine();
//            System.out.print("Kết quả của tìm kiếm là: ");
//            for (Teacher teacher : teacherList) {
//                if (teacher.getName().indexOf(nameTeacher) >= 0) {
//                    System.out.println(teacher.toString());
//                }
//                else {
//                    System.out.println("Không có giảng viên phù hợp với từ khóa vừa nhập");
//                }
//            }
//        } else if (choice == 2) {
//            System.out.print("Nhập mã giảng viên: ");
//            String codeTeacher = scanner.nextLine();
//            System.out.println("Kết quả của tìm kiếm là: ");
//            for (Teacher teacher : teacherList) {
//                if (teacher.getCode().indexOf(codeTeacher) >= 0) {
//                    System.out.println(teacher.toString());
//                }
//                else {
//                    System.out.println("Không có giảng viên phù hợp với từ khóa vừa nhập");
//                }
//            }
//        }

        switch (choice) {
            case 1:
                System.out.print("Nhập mã giảng viên: ");
                String codeStudent = scanner.nextLine();
                System.out.println("Kết quả của tìm kiếm là: ");
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getCode().equals(codeStudent)) {
                        System.out.println(teacherList.get(i));
                    } else {
                        System.out.println("Không có giảng viên phù hợp với từ khóa vừa nhập");
                    }
                }
                break;
            case 2:
                System.out.print("Nhập mã giảng viên: ");
                String nameStudent = scanner.nextLine();
                System.out.println("Kết quả của tìm kiếm là: ");
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getName().contains(nameStudent)) {
                        System.out.println(teacherList.get(i));
                    } else {
                        System.out.println("Không có giảng viên tìm được với kết quả vừa nhập");
                    }
                }
                break;
            default:
                System.out.println("Lựa chọn không nằm trong phạm vi tìm kiếm");
        }
    }

    @Override
    public void sortTeacher() {
        if (teacherList.size() <= 0) {
            System.out.println("Danh sách không có");
        }
        boolean iSWap = true;
        for (int i = 0; i < teacherList.size() - 1 && iSWap; i++) {
            iSWap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {

                if (teacherList.get(j).compareTo(teacherList.get(j+1)) > 0) {
                    Teacher temp = teacherList.get(j + 1);
                    teacherList.set(j + 1, teacherList.get(j));
                    teacherList.set(j, temp);
                    iSWap = true;
                }
            }
        }
        System.out.println("Sắp xếp thành công!");
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
