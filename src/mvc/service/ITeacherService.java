package mvc.service;

import java.io.IOException;

public interface ITeacherService {

    void addTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void displayTeacher() throws IOException;

    void searchTeacherId();

    void sortTeacher() throws IOException;

    void editTeacher() throws IOException;
}
