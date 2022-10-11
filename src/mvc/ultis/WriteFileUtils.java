package mvc.ultis;

import mvc.model.Student;
import mvc.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFileUtils {
    private static void writeFile1(String path, List<String> strings, boolean append) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,append));
        for (String string : strings){
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
    public static void writeStudentFile1(String path, List<Student> students, boolean append) throws IOException {
        List<String> strings = new ArrayList<>();
        for (Student student : students) {
            strings.add(student.getInfo());
        }
        writeFile1(path,strings,append);
    }

    public static void writeTeacherFile1(String path, List<Teacher> teachers, boolean append) throws IOException {
        List<String> strings = new ArrayList<>();
        for (Teacher teacher : teachers) {
            strings.add(teacher.getInfo());
        }
        writeFile1(path,strings,append);
    }
}
