package ss_exercise_plus.esercise1.view;

import ss_exercise_plus.esercise1.controllor.PersonController;
import ss_exercise_plus.esercise1.controllor.StudentController;
import ss_exercise_plus.esercise1.controllor.TeacherController;

public class Main {
    public static void main(String[] args) {

        PersonController.menuPerson();

        StudentController.menuStudent();

        TeacherController.menuTeacher();
    }
}
