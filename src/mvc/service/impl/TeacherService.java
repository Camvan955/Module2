package mvc.service.impl;

import mvc.model.Teacher;
import mvc.service.ITeacherService;
import mvc.ultis.ExceptionUtils;
import mvc.ultis.ReadFileUltis;
import mvc.ultis.WriteFileUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class TeacherService implements ITeacherService {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    private static final String TEACHER_FILE = "src/mvc/data/teacher.csv";

    @Override
    public void addTeacher() throws IOException {
        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = this.infoTeacher();

        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
        WriteFileUtils.writeTeacherFile1(TEACHER_FILE,teacherList,true);
    }


    @Override
    public void removeTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUltis.readTeacherFile(TEACHER_FILE);
        System.out.print("Mời bạn nhập mã giảng viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa giảng viên này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        WriteFileUtils.writeTeacherFile1(TEACHER_FILE,teacherList,false);
    }

    @Override
    public void displayTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUltis.readTeacherFile(TEACHER_FILE);
        for (Teacher teacher:teacherList) {
            System.out.println(teacher);
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
    public void searchTeacherId(){
        List<Teacher> teacherList = new ArrayList<>();
        System.out.print("Mời bạn nhập mã giảng viên cần tìm: ");
        String code = scanner.nextLine();
        boolean flagSearch = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(code)) {
                System.out.println(teacherList.get(i).toString());
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Không tìm thấy giảng viên cần tìm.");
        }
    }

    @Override
    public void sortTeacher() throws IOException {
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 1; i < teacherList.size(); i++) {
            Teacher key = teacherList.get(i);
            int j;
            for (j = i - 1; j >= 0 && teacherList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                teacherList.set(j + 1, teacherList.get(j));
            }
            teacherList.set(j + 1, key);
        }
        displayTeacher();
    }

    @Override
    public void editTeacher() throws IOException {
        List<Teacher> teacherList = ReadFileUltis.readTeacherFile(TEACHER_FILE);

        System.out.print("Nhập id muốn sửa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < teacherList.size() ; i++) {
            if(teacherList.get(i).getId().equals(id)){
                teacherList.set(i,infoTeacher());
                break;
            }
        }
        WriteFileUtils.writeTeacherFile1(TEACHER_FILE,teacherList,false);

    }

    private Teacher infoTeacher() {
        String code = addCode();

        String name = addName();

        String dayOfBirth = addDayBirth();

        String gender = addGender();

        String technique = addTechnique();


        Teacher teacher = new Teacher(code, name, dayOfBirth, gender, technique);
        return teacher;
    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã giảng viên: ");
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
                System.out.print("Mời bạn nhập tên giảng viên: ");
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
                System.out.print("Mời bạn nhập ngày sinh giảng viên: ");
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
                System.out.print("Mời bạn nhập giới tính giảng viên: ");
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


    private String addTechnique() {
        String nameClass;
        while (true) {
            try {
                System.out.print("Mời bạn nhập chuyên môn: ");
                nameClass = scanner.nextLine();
                if (!nameClass.matches("^([A-ZĐ][a-záàảãạăâắằấầặẵẫêậẩéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$")) {
                    throw new ExceptionUtils("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nameClass;
    }


}
