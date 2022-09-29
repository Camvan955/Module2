package ss16_io_file_text.exercise.esercise1.service;

import java.io.IOException;

public interface IStudentService {

    void addStudent() throws IOException;

    void displayStudent() throws IOException;

    void removeStudent();

    void searchStudent() throws IOException;

    void sortStudent() throws IOException;

}
