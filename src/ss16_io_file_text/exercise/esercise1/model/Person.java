package ss16_io_file_text.exercise.esercise1.model;

public abstract class Person {
    private String code;
    private String name;
    private String dayOfBirth;
    private Boolean gender;

    public Person() {
    }

    public Person(String code, String name, String dayOfBirth, Boolean gender) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code= " + code + '\'' +
                ", name= " + name + '\'' +
                ", dayOfBirth= " + dayOfBirth + '\'' +
                ", gender= " + gender + " ";
    }
}
