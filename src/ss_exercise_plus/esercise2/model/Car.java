package ss_exercise_plus.esercise2.model;

public class Car extends Transport {
    private int numberOfSeats;
    private String carModel;

    public Car() {
    }

    public Car(int numberOfSeats, String carModel) {
        this.numberOfSeats = numberOfSeats;
        this.carModel = carModel;
    }

    public Car(String seaControl, String nameManufacturer, int yearOfManufacturer, String owner, int numberOfSeats, String carModel) {
        super(seaControl, nameManufacturer, yearOfManufacturer, owner);
        this.numberOfSeats = numberOfSeats;
        this.carModel = carModel;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Xe ô tô{" +
                "Số chỗ ngồi = " + numberOfSeats +
                ",Kiểu xe = '" + carModel + '\'' +
                '}';
    }
}
