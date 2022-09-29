package ss16_io_file_text.exercise.esercise1.service.impl;

import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.CodeException;
import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.DateException;
import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.NameException;
import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.PointException;
import ss16_io_file_text.exercise.esercise1.model.Student;
import ss16_io_file_text.exercise.esercise1.model.Teacher;
import ss16_io_file_text.exercise.esercise1.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService<flagDelete> implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() throws IOException {

        studentList = readFile();
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!");
        writeFile(studentList);
    }

    @Override
    public void displayStudent() throws IOException {
        studentList = readFile();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
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
        if (!flagDelete) {
            System.out.println("Không tìm thấy học viên cần xóa!");
        }
    }

    @Override
    public void searchStudent() throws IOException {
        studentList = readFile();
        int choice;
        System.out.print("Nhập tùy chọn: 1: tìm theo tên học viên - 2: tìm theo mã học viên: \t");
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập mã học viên: ");
                String codeStudent = scanner.nextLine();
                System.out.println("Kết quả của tìm kiếm là: ");
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getCode().equals(codeStudent)) {
                        System.out.println(studentList.get(i));
                    } else {
                        System.out.println("Không có học viên phù hợp với từ khóa vừa nhập");
                    }
                }
                break;
            case 2:
                System.out.print("Nhập mã học viên: ");
                String nameStudent = scanner.nextLine();
                System.out.println("Kết quả của tìm kiếm là: ");
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getName().contains(nameStudent)) {
                        System.out.println(studentList.get(i));
                    } else {
                        System.out.println("Lựa chọn không nằm trong phạm vi tìm kiếm");
                    }
                }
                break;
            default:
                System.out.println("Lựa chọn không nằm trong phạm vi tìm kiếm");
        }
    }


    @Override
    public void sortStudent() throws IOException {
        studentList = readFile();
        if (studentList.size() <= 0) {
            System.out.println("Không có danh sách");
            return;
        }
        Boolean iSwap = true;
        for (int i = 0; i < studentList.size() - 1 && iSwap; i++) {
            iSwap = false;
            for (int j = 0; j < studentList.size() - i - 1; j++) {
                if (studentList.get(j).compareTo(studentList.get(j + 1)) > 0) {
                    iSwap = true;
                    Student temp = studentList.get(j + 1);
                    studentList.set(j + 1, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
        writeFile(studentList);
        System.out.println("Sắp xếp thành công!");
    }

    public Student infoStudent() {
        String code, name, nameClass;
        String dateOfBirth ;
        double point;
        Boolean gender;

        while (true) {
            try{
                System.out.print("Nhập mã học viên: ");
                CodeException.codeCheck(code = scanner.nextLine());
                break;
            } catch (CodeException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập tên học viên: ");
                NameException.nameCheck(name = scanner.nextLine());
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập ngày sinh học viên: ");
                DateException.dateCheck(dateOfBirth = scanner.nextLine());
                break;
            } catch (DateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập giới tính học viên: ");
        String tempGender = scanner.nextLine();
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.print("Nhập tên lớp của học viên: ");
         nameClass = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Nhập điểm của học viên: ");
                PointException.pointCheck(point = Double.parseDouble(scanner.nextLine()));
                break;
            } catch (PointException e) {
                System.out.println(e.getMessage());
            }
        }

        Student student = new Student(code, name, dateOfBirth, gender, nameClass, point);
        return student;
    }

    private List<Student> readFile() throws IOException{
        studentList = new ArrayList<>();
        File file = new File("src\\ss16_io_file_text\\exercise\\esercise1\\data\\student.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        String[] studentArray;
        while ((line = bufferedReader.readLine()) != null) {
            studentArray = line.split(",");
            studentList.add(new Student(studentArray[0],studentArray[1], studentArray[2],Boolean.parseBoolean(studentArray[3]),studentArray[4], Double.parseDouble(studentArray[5])));
        }
        bufferedReader.close();

        return studentList;
    }

    private void writeFile(List<Student> studentList) throws IOException {
        File file = new File("src\\ss16_io_file_text\\exercise\\esercise1\\data\\teacher.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        for (Student student : studentList) {
            bufferedWriter.write(student.toString());
            bufferedWriter.newLine();;
        }

        bufferedWriter.close();
    }
}

