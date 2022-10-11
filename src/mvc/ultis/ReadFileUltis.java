package mvc.ultis;

import mvc.model.Student;
import mvc.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUltis {
    public static List<String> readFile(String path) throws IOException {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (!file.exists()) {
                throw new FileNotFoundException("Không tìm thấy file");
            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("File not found!");
        }
        return strings;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 6) {
                students.add(new Student(info[0], info[1], info[2], info[3], info[4], Double.parseDouble(info[5])));
            }
        }
        return students;
    }

    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Teacher> teachers = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info.length == 5) {
                teachers.add(new Teacher(info[0], info[1], info[2], info[3], info[4]));
            }
        }
        return teachers;
    }
}
