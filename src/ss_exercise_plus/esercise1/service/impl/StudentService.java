package ss_exercise_plus.esercise1.service.impl;

import ss_exercise_plus.esercise1.model.Student;
import ss_exercise_plus.esercise1.model.Teacher;
import ss_exercise_plus.esercise1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService<flagDelete> implements IStudentService {
    private static Scanner scanner= new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() {
        Student student = this.inforStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayStudent() {
    for(Student student: studentList){
        System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getCode().equals(code)) {
                System.out.print("Bạn có chắc muốn xóa học viên này không? Y: có - N: không");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    studentList.remove(i);
                    System.out.println("Xóa học viên thành công");
                }
                flagDelete = true;
                break;
            }

        }
        if(!flagDelete) {
            System.out.println("Không tìm thấy học viên cần xóa!");
        }
    }

    @Override
    public void searchStudent() {
        int choice;
        System.out.print("Nhập tùy chọn: 1: tìm theo tên học viên - 2: tìm theo mã học viên: \t");
        choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            System.out.print("Nhập tên học viên: ");
            String nameStudent = scanner.nextLine();
            System.out.print("Kết quả của tìm kiếm là: ");
            for (Student student: studentList) {
                if (student.getName().indexOf(nameStudent) >= 0) {
                    System.out.println(student.toString());
                }
                else {
                    System.out.println("Không có học viên phù hợp với từ khóa vừa nhập");
                }
            }
        } else if (choice == 2) {
            System.out.print("Nhập mã học viên: ");
            String codeStudent = scanner.nextLine();
            System.out.println("Kết quả của tìm kiếm là: ");
            for (Student student: studentList) {
                if (student.getCode().indexOf(codeStudent) >= 0) {
                    System.out.println(student.toString());
                }
                else {
                    System.out.println("Không có học viên phù hợp với từ khóa vừa nhập");
                }
            }
        }
        else {
            System.out.println("Lựa chọn không nằm trong phạm vi tìm kiếm");
        }
    }

    public Student inforStudent() {
        System.out.print("Nhập mã học viên: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh học viên: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính học viên: ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if(tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.print("Nhập tên lớp của học viên: ");
        String nameClass = scanner.nextLine();
        System.out.print("Nhập điểm của học viên: ");
        Double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, dateOfBirth, gender, nameClass, point );
        return student;
    }
}
