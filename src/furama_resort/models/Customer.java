package furama_resort.models;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeOfGuest;
    private String addres;

    public Customer() {
    }

    public Customer(String typeOfGuest, String addres) {
        this.typeOfGuest = typeOfGuest;
        this.addres = addres;
    }

    public Customer(String id, String name, LocalDate dayOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeOfGuest, String addres) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.addres = addres;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", addres='" + addres + '\'' +super.toString()+
                '}';
    }
}
