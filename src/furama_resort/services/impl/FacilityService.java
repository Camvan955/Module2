package furama_resort.services.impl;

import furama_resort.controllers.FuramaController;
import furama_resort.models.Facility;
import furama_resort.models.House;
import furama_resort.models.Room;
import furama_resort.models.Villa;
import furama_resort.services.IFacilityService;
import furama_resort.utils.exception.CheckExceptions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void displayList() {
        Set set = linkedHashMap.keySet();
        for (Object  key : set) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }

    @Override
    public void addNew() {
        int choice;
        while (true) {
            try {
                System.out.println("Mời bạn nhập lựa chọn: ");
                System.out.println("1. Thêm mới Villa");
                System.out.println("2. Thêm mới House");
                System.out.println("3. Thêm mới Room");
                System.out.println("4. Trở về menu");

                System.out.print("Lựa chọn của bạn là: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        Villa villa = this.getInfoVilla();
                        linkedHashMap.put(villa, 0);
                        break;
                    case 2:
                        House house = this.getInfoHouse();
                        linkedHashMap.put(house, 0);
                        break;
                    case 3:
                        Room room = this.getInfoRoom();
                        linkedHashMap.put(room, 0);
                        break;
                    case 4:
                        FuramaController.bookingManagement();
                    default:
                        System.out.println("Số nhập vào không khả thi!");
                }

                CheckExceptions.addNewCheck(choice);
            } catch (CheckExceptions | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }

    private Villa getInfoVilla() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng: ");
        Double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        Double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa: ");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu thuê: ");
        String typeOfRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        Double swimmingPoolAarea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng của Villa: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(nameService, areaUse, rentalCost, maxPerson, typeOfRental, roomStandard, swimmingPoolAarea, numberOfFloors);
        return villa;
    }

    private House getInfoHouse() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng: ");
        Double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        Double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa: ");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu thuê: ");
        String typeOfRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng của House: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());

        House house = new House(nameService, areaUse, rentalCost, maxPerson, typeOfRental, roomStandard, numberOfFloors);
        return house;
    }

    private Room getInfoRoom() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng: ");
        Double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        Double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa: ");
        int maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu thuê: ");
        String typeOfRental = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm:");
        String freeService = scanner.nextLine();

        Room room = new Room(nameService, areaUse, rentalCost, maxPerson, typeOfRental, freeService);
        return room;

    }
}
