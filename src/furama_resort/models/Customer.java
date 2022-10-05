package furama_resort.models;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate dayOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeOfGuest, String addres) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", addres='" + address + '\'' +super.toString()+
                '}';
    }
}
