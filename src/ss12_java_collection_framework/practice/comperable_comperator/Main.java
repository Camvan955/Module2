package ss12_java_collection_framework.practice.comperable_comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> list111 = new ArrayList<Student>();
        list111.add(student);
        list111.add(student1);
        list111.add(student2);
        list111.add(student3);
//        Collections.sort(list111);
        for(Student st : list111){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list111,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : list111){
            System.out.println(st.toString());
        }
    }
}
