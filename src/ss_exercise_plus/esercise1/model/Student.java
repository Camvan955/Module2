package ss_exercise_plus.esercise1.model;

public class Student extends Person implements Comparable<Student> {
    private String nameClass;
    private double point;

    public Student() {
    }

    public Student(String nameClass, double point) {
        this.nameClass = nameClass;
        this.point = point;
    }

    public Student(String code, String name, String dayOfBirth, Boolean gender, String nameClass, double point) {
        super(code, name, dayOfBirth, gender);
        this.nameClass = nameClass;
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " nameClass=" + nameClass + '\'' +
                ", point=" + point +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if (o.getName().compareTo(o.getName()) != 0 ) {
            return o.getName().compareTo(o.getName());
        }
        return o.getCode().compareTo(o.getCode());
    }
}
