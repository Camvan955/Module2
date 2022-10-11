package mvc.model;

import javax.swing.*;

public class Teacher extends Person {
    private String technique;

    public Teacher() {
    }

    public Teacher(String technique) {
        this.technique = technique;
    }

    public Teacher(String id, String name, String dayOfBirth, String gender, String technique) {
        super(id, name, dayOfBirth, gender);
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
        return "Teacher{" +super.toString()+
                "technique='" + technique + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s", super.getId(),super.getName(),super.getDayOfBirth(),super.getGender(),getTechnique());
    }
}
