package ss19_string_regex.exercise.exercise_plus.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void removeStudent() throws IOException;

    void displayStudent() throws IOException;

    void searchStudentName() throws IOException;

    void searchStudentId() throws IOException;

    void sortStudent() throws IOException;
}
