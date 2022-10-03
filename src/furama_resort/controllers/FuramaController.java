package furama_resort.controllers;


import furama_resort.services.IEmployeeService;
import furama_resort.services.impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService iEmployeeService = (IEmployeeService) new EmployeeService();



    public static void displayMainMenu() {
        while (true) {
            System.out.println("-----------RESORT FURAMA MANAGEMENT PROGRAM -----------");
            System.out.println("Please enter the match the option");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    FuramaController.employeeManagement();
                    break;
                case 2:
                    FuramaController.customerManagement();
                    break;
                case 3:
                    FuramaController.facilityManagement();
                    break;
                case 4:
                    FuramaController.bookingManagement();
                    break;
                case 5:
                    FuramaController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }


    public static void employeeManagement() {
        while (true) {
            System.out.println("----------Employee Management----------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                    IEmployeeService.displayListEmployee();
                    break;
                case 2:
//                    IEmployeeService.addNewEmployee();
                    break;
                case 3:
//                    IEmployeeService.editEmployee();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }

    public static void customerManagement() {
        while (true) {
            System.out.println("----------Employee Management----------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }

    public static void facilityManagement() {
        while (true) {
            System.out.println("----------Facility Management----------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }

    public static void bookingManagement() {
        while (true) {
            System.out.println("----------Booking Management----------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Edit contracts");
            System.out.println("5. Return main menu");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }

    public static void promotionManagement() {
        while (true) {
            System.out.println("----------Promotion Management----------");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");

            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Choices out of possibility");
            }
        }
    }
}
