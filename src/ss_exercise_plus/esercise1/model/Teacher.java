package ss_exercise_plus.esercise1.model;

public class Teacher extends Person {
    private String technique;

    public Teacher () {
    }

    public Teacher(String technique) {
        this.technique = technique;
    }

    public Teacher(String code, String name, String dayOfBirth, Boolean gender, String technique) {
        super(code, name, dayOfBirth, gender);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return  super.toString() +
                 "Teacher{" +
                "technique='" + technique + '\'' +
                '}';
    }
}
