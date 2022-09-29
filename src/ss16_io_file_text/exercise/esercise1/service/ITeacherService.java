package ss16_io_file_text.exercise.esercise1.service;

import java.io.IOException;

public interface ITeacherService {

    void addTeacher() throws IOException;

    void displayTeacher() throws IOException;

    void removeTeacher();

    void searchTeacher() throws IOException;

    void sortTeacher() throws IOException;
}
