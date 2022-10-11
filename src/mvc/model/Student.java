package mvc.model;

public class Student extends Person {
    private String nameClass;
    private double point;

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",super.getId(),super.getName(),super.getDayOfBirth(),super.getGender(),getNameClass(),getPoint());
    }

    public Student() {
    }

    public Student(String nameClass, double point) {
        this.nameClass = nameClass;
        this.point = point;
    }

    public Student(String id, String name, String dayOfBirth, String gender, String nameClass, double point) {
        super(id, name, dayOfBirth, gender);
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
        return "Student{"+ super.toString()+
                "nameClass='" + nameClass + '\'' +
                ", point=" + point +
                '}';
    }
}
