package ss12_java_collection_framework.practice.difference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("A", 21,"HN");
        Student student2 = new Student("B", 23, "ĐN");
        Student student3 = new Student("C", 24, "SG");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student2);

        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student);
        }
        System.out.println("......................");

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students.add(student2);

        for(Student student : students) {
            System.out.println(student.toString());
        }
    }
}
