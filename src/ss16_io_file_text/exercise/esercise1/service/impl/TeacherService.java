package ss16_io_file_text.exercise.esercise1.service.impl;

import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.CodeException;
import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.DateException;
import ss15_exception_debug.exercise.exercise2.esercise1.service.utils.NameException;
import ss16_io_file_text.exercise.esercise1.model.Teacher;
import ss16_io_file_text.exercise.esercise1.service.ITeacherService;
import ss16_io_file_text.exercise.read_file.Country;
import ss16_io_file_text.practice.sum_in_file_text.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService<flagDelete> implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() throws IOException {

        teacherList = readFile();
        Teacher teacher = this.inforTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
        writeFile(teacherList);
    }

    @Override
    public void displayTeacher() throws IOException {
        teacherList = readFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.info());
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
    public void searchTeacher() throws IOException {
        teacherList = readFile();

        int choice;
        System.out.print("Nhập tùy chọn: 1: tìm theo tên giảng viên - 2: tìm theo mã giảng viên: \t");
        choice = Integer.parseInt(scanner.nextLine());


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
    public void sortTeacher() throws IOException {
        teacherList = readFile();

        if (teacherList.size() <= 0) {
            System.out.println("Danh sách không có");
        }
        boolean iSWap = true;
        for (int i = 0; i < teacherList.size() - 1 && iSWap; i++) {
            iSWap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {

                if (teacherList.get(j).compareTo(teacherList.get(j + 1)) > 0) {
                    Teacher temp = teacherList.get(j + 1);
                    teacherList.set(j + 1, teacherList.get(j));
                    teacherList.set(j, temp);
                    iSWap = true;
                }
            }
        }
        writeFile(teacherList);
        System.out.println("Sắp xếp thành công!");
    }


    public Teacher inforTeacher() {
        String code, name;
        String dateOfBirth;
        while (true) {
            try {
                System.out.print("Nhập mã giảng viên: ");
                CodeException.codeCheck(code = scanner.nextLine());;
                break;
            } catch (CodeException e) {
                System.out.println(e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Nhập tên giảng viên: ");
                NameException.nameCheck(name = scanner.nextLine());
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày sinh giảng học viên: ");
                DateException.dateCheck(dateOfBirth = scanner.nextLine());
                break;
            } catch (DateException e) {
                System.out.println(e.getMessage());
            }
        }
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

    private List<Teacher> readFile() throws IOException {
        teacherList = new ArrayList<>();
        File file = new File("src\\ss16_io_file_text\\exercise\\esercise1\\data\\teacher.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        String[] teacherArrays;
        while ((line = bufferedReader.readLine()) != null) {
            teacherArrays = line.split(",");
            teacherList.add(new Teacher(teacherArrays[0], teacherArrays[1], teacherArrays[2], Boolean.parseBoolean(teacherArrays[3]), teacherArrays[4]));
        }
        bufferedReader.close();

        return teacherList;
    }

    private void writeFile(List<Teacher> teacherList) throws IOException {
        File file = new File("src\\ss16_io_file_text\\exercise\\esercise1\\data\\teacher.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Teacher teacher : teacherList) {
            bufferedWriter.write(teacher.info());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
