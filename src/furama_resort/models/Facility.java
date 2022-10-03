package furama_resort.models;

public abstract class Facility {
    private String nameService;
    private Double useArea;     //diện tích sử dụng
    private Double rentalCost; // chi phí thuê
    private int maxPerson;   //Số lượng người tối đa
    private String typeOfRental;    //Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

    public Facility() {
    }

    public Facility(String nameService, Double useArea, Double rentalCost, int maxPerson, String typeOfRental) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentalCost = rentalCost;
        this.maxPerson = maxPerson;
        this.typeOfRental = typeOfRental;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getUseArea() {
        return useArea;
    }

    public void setUseArea(Double useArea) {
        this.useArea = useArea;
    }

    public Double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentalCost=" + rentalCost +
                ", maxPerson=" + maxPerson +
                ", typeOfRental='" + typeOfRental + '\'' +
                '}';
    }
}
