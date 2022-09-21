package ss_exercise_plus.esercise2.model;

public class Motorcycle extends Transport {
    private String Wattage;

    public Motorcycle() {
    }

    public Motorcycle(String wattage) {
        Wattage = wattage;
    }

    public Motorcycle(String seaControl, String nameManufacturer, int yearOfManufacturer, String owner, String wattage) {
        super(seaControl, nameManufacturer, yearOfManufacturer, owner);
        Wattage = wattage;
    }

    @Override
    public String toString() {
        return "Xe máy {" +
                " Công suất = '" + Wattage + '\'' +
                '}';
    }
}
