package ss5_access_modifier_static_method_static_property.exercise.access_modifier2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    // thay đổi access modifier:
    // public, default, protected: ok
    //private: no ok
}
