package ss16_io_file_text.exercise.esercise1.view;

import ss16_io_file_text.exercise.esercise1.controllor.PersonController;
import ss16_io_file_text.exercise.esercise1.controllor.StudentController;
import ss16_io_file_text.exercise.esercise1.controllor.TeacherController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        PersonController.menuPerson();

        StudentController.menuStudent();

        TeacherController.menuTeacher();
    }
}
