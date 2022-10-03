package furama_resort.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;
    private String location;
    private Double salary;

    public Employee() {
    }

    public Employee(String level, String location, Double salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String code, String name, LocalDate dayOfBirth, String gender, int identityCard, int phoneNumber, String email, String level, String location, Double salary) {
        super(code, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

}
