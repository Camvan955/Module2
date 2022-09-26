package ss15_exception_debug.exercise.exercise2.esercise1.view;

import ss15_exception_debug.exercise.exercise2.esercise1.controllor.PersonController;
import ss15_exception_debug.exercise.exercise2.esercise1.controllor.StudentController;
import ss15_exception_debug.exercise.exercise2.esercise1.controllor.TeacherController;

public class Main {
    public static void main(String[] args) {

        PersonController.menuPerson();

        StudentController.menuStudent();

        TeacherController.menuTeacher();
    }
}
