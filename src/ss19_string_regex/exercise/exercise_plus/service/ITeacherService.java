package ss19_string_regex.exercise.exercise_plus.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void displayTeacher() throws IOException;

    void searchTeacherName() throws IOException;

    void searchTeacherId() throws IOException;

    void sortTeacher() throws IOException;
}
