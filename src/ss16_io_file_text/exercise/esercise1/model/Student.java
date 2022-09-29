package ss16_io_file_text.exercise.esercise1.model;

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

    public String info() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",getCode(),getName(),getDayOfBirth(),getGender(),getNameClass(),getPoint());
    }


    @Override
    public int compareTo(Student o) {
        if (this.getName().compareTo(o.getName()) != 0 ) {
            return this.getName().compareTo(o.getName());
        }
        return this.getCode().compareTo(o.getCode());
    }
}
