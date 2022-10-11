package mvc.service.impl;

import mvc.model.Student;
import mvc.service.IStudentService;
import mvc.ultis.ExceptionUtils;
import mvc.ultis.ReadFileUltis;
import mvc.ultis.WriteFileUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static final String STUDENT_FILE="src/mvc/data/student.csv";

    @Override
    public void addStudent() throws IOException {
        List<Student> studentList = new ArrayList<>();
        Student student = this.infoStudent();

        studentList.add(student);
        System.out.println("Thêm mới thành công");
        WriteFileUtils.writeStudentFile1(STUDENT_FILE,studentList,true);
    }


    @Override
    public void removeStudent() throws IOException {
        List<Student> studentList = ReadFileUltis.readStudentFile(STUDENT_FILE);
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        WriteFileUtils.writeStudentFile1(STUDENT_FILE,studentList,false);
    }

    @Override
    public void displayStudent() throws IOException {
        List<Student> studentList = ReadFileUltis.readStudentFile(STUDENT_FILE);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

//    @Override
//    public void searchStudentName() throws IOException {
//        List<Student> studentList =ReadFileUltis.readStudentFile(STUDENT_FILE);
//        System.out.print("Mời bạn nhập tên học sinh cần tìm: ");
//        String name = scanner.nextLine();
//        boolean flagDelete = false;
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getName().contains(name)) {
//                System.out.println(studentList.get(i).toString());
//                flagDelete = true;
//            }
//        }
//        if (!flagDelete) {
//            System.out.println("Không tìm thấy học sinh cần tìm.");
//        }
//    }

    @Override
    public void searchStudentId(){
        List<Student> studentList = new ArrayList<>();
        System.out.print("Mời bạn nhập mã học sinh cần tìm: ");
        String code = scanner.nextLine();
        boolean flagSearch = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(code)) {
                System.out.println(studentList.get(i).toString());
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Không tìm thấy học sinh cần tìm.");
        }
    }

    @Override
    public void sortStudent() throws IOException {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i < studentList.size(); i++) {
            Student key = studentList.get(i);
            int j;
            for (j = i - 1; j >= 0 && studentList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                studentList.set(j + 1, studentList.get(j));
            }
            studentList.set(j + 1, key);
        }
        displayStudent();
    }

    @Override
    public void editStudent() throws IOException {
        List<Student> studentList = ReadFileUltis.readStudentFile(STUDENT_FILE);
        System.out.print("Nhập id muốn sửa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < studentList.size() ; i++) {
            if(studentList.get(i).getId().equals(id)){
                studentList.set(i,infoStudent());
                break;
            }
        }
        WriteFileUtils.writeStudentFile1(STUDENT_FILE,studentList,false);
    }

    private Student infoStudent() {
        String code = addCode();

        String name = addName();

        String dayOfBirth = addDayBirth();

        String gender = addGender();

        String nameClass = addNameClass();

        double point = addPoint();

        Student student = new Student(code, name, dayOfBirth, gender, nameClass, point);
        return student;
    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã sinh viên: ");
                code = scanner.nextLine();
                if (!code.matches("[H][V][0-9]{3,6}")) {
                    throw new ExceptionUtils("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return code;
    }

    private String addName() {
        String name;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên học viên: ");
                name = scanner.nextLine();
//                String[] str = name.trim().split("");
                String regex= "^([A-ZĐ][a-záàảãạăâắằấầặẵẫêậẩéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
//                String regex ="^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$";

                    if (!name.matches(regex)) {
                        throw new ExceptionUtils("Nhập sai định dạng");
                    }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    private static boolean isValiDateDay(String targe ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try{
            simpleDateFormat.parse(targe);
            return true;
        }catch (ParseException e){
        }return false;
    }

    private String addDayBirth() {
        String dayOfBirth;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày sinh sinh viên: ");
                dayOfBirth = scanner.nextLine();
                if(!isValiDateDay(dayOfBirth)){
                    throw new ExceptionUtils("Lỗi định dạng ngày tháng năm");
                }
                break;
            } catch (ExceptionUtils e) {
                System.out.println("Ngày nhập sai định dạng, nhập lại");
            }
        }
        return dayOfBirth;
    }

    private String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Mời bạn nhập giới tính sinh viên: ");
                gender = scanner.nextLine();
                if (!gender.matches("^[NKamhngữô]+$")) {
                    throw new ExceptionUtils("Vui lòng nhập đúng định dạng");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }


    private String addNameClass() {
        String nameClass;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên lớp: ");
                nameClass = scanner.nextLine();
                if (!nameClass.matches("^C[0-9]{4}G[0-9]$")) {
                    throw new ExceptionUtils("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nameClass;
    }

    private double addPoint() {
        double point;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                point = Double.parseDouble(scanner.nextLine());
                if (point < 0 || point > 10) {
                    throw new ExceptionUtils("Nhập lại điểm");
                }
                break;
            }catch (NumberFormatException | ExceptionUtils e){
                System.out.println(e.getMessage());
            }
        }
        return point;
    }
}
