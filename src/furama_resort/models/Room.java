package furama_resort.models;

public class Room extends Facility {
    private String freeService;     //dịch vụ miễn phí

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, Double useArea, Double rentalCost, int maxPerson, String typeOfRental, String freeService) {
        super(nameService, useArea, rentalCost, maxPerson, typeOfRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                super.toString()+
                '}';
    }
}
