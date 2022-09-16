package ss10_dsa_list.exercise.structure_settinng_list;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Học sinh {" +
                    "có mã số = " + id +
                    ", tên= '" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vân");
        Student b = new Student(2, "Mai");
        Student c = new Student(3, "Nhung");
        Student d = new Student(4, "Quỳnh");
        Student f = new Student(5, "Anh");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(2,f);

        for (int i = 0; i < studentMyList.size() ; i++) {
           Student student =(Student) studentMyList.elements[i];
            System.out.println(student.getId() + " " + student.getName());

        }

        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.get(4).getId());

        System.out.println(studentMyList.indexOf(c));


        System.out.println(studentMyList.contains(b));

        newMyList = studentMyList.clone();
        for (int i = 0; i < newMyList.size(); i++) {
            System.out.println(newMyList.get(i).getName());

        }

    }

}
