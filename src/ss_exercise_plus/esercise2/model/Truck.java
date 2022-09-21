package ss_exercise_plus.esercise2.model;

public class Truck extends Transport {
    private int Tonnage;


    public Truck() {
    }

    public Truck(int tonnage) {
        Tonnage = tonnage;
    }

    public Truck(String seaControl, String nameManufacturer, int yearOfManufacturer, String owner, int tonnage) {
        super(seaControl, nameManufacturer, yearOfManufacturer, owner);
        Tonnage = tonnage;
    }

    public int getTonnage() {
        return Tonnage;
    }

    public void setTonnage(int tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Xe tải {" +
                "Tải trọng = " + Tonnage +
                '}';
    }
}
