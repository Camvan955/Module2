package ss_exercise_plus.esercise2.model;

public class Transport {
    private String seaControl; // biển kiểm soát
    private String nameManufacturer; // hãng sản xuất
    private int yearOfManufacturer; // năm sản suất
    private String owner;

    public Transport() {
    }

    public Transport(String seaControl, String nameManufacturer, int yearOfManufacturer, String owner) {
        this.seaControl = seaControl;
        this.nameManufacturer = nameManufacturer;
        this.yearOfManufacturer = yearOfManufacturer;
        this.owner = owner;
    }

    public String getSeaControl() {
        return seaControl;
    }

    public void setSeaControl(String seaControl) {
        this.seaControl = seaControl;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Phương tiện giao thông {" +
                "Biển kiểm soát = '" + seaControl + '\'' +
                ",Tên hãng sản xuất = '" + nameManufacturer + '\'' +
                ", Năm sản suất = " + yearOfManufacturer +
                ", Chủ sở hữu '" + owner + '\'' +
                '}';
    }
}
