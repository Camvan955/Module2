package furama_resort.models;

import java.time.LocalDate;

public class Booking {
    private String idBooking;
    private LocalDate dayStart;
    private LocalDate dayEnd;
    private String idCustomer;
    private String nameService;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String idBooking, LocalDate dayStart, LocalDate dayEnd, String idCustomer, String nameService, String typeOfService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
