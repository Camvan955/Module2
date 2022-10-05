package furama_resort.services.impl;

import furama_resort.models.Customer;
import furama_resort.services.ICustomerService;
import furama_resort.utils.exception.CheckExceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void displayList() {
        if (customerList.size() == 0) {
            System.out.println("Không có danh sách khách hàng để hiển thị!");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }

        }
    }

    @Override
    public void addNew() {

        Customer customer = this.info();
        customerList.add(customer);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void edit() {

    }

    private Customer info() {
        String id = addCode();
        String name = addName();
        LocalDate dayOfBirth = addDayBirth();
        String gender = addGender();
        String identityCard = addidentityCard();
        String phoneNumber = addphoneNumber();
        String email = addEmail();
        String typeOfGuest = addTypeOfGuest();
        String address = addaddress();

        Customer customer = new Customer(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, typeOfGuest, address);
        return customer;
    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Nhập mã khách hàng: ");
                code = scanner.nextLine();
                if (CheckExceptions.codeCustomerCheck(code)) {
                    return code;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private LocalDate addDayBirth() {
        LocalDate dayOfBirth;
        while (true) {
            try {
                System.out.print("Ngày ngày sinh của khách hàng: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Không đúng định dạng, mời nhập lại");
            }
        }
        return dayOfBirth;
    }

    private String addName() {
        String name;
        while (true) {
            try {
                System.out.print("Nhập tên khách hàng: ");
                name = scanner.nextLine();
                if (CheckExceptions.nameCheck(name)) {
                    return name;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Nhập giới tính khách hàng: ");
                gender = scanner.nextLine();
                if (CheckExceptions.genderCheck(gender)) {
                    return gender;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String addidentityCard() {
        String identityCard;
        while (true) {
            try {
                System.out.print("Nhập căn cước công dân của khách hàng: ");
                identityCard = scanner.nextLine();
                if (CheckExceptions.idCardCheck(identityCard)) {
                    return identityCard;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String addphoneNumber() {
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Nhập số điện thoại của nhân viên: ");
                phoneNumber = scanner.nextLine();
                if (CheckExceptions.phoneNumberCheck(phoneNumber)) {
                    return phoneNumber;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String addEmail() {
        String email;
        while (true) {
            try {
                System.out.print("Nhập email của khách hàng: ");
                email = scanner.nextLine();
                if (CheckExceptions.emailCheck(email)) {
                    return email;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String addTypeOfGuest() {
        System.out.println("Nhập số tương ứng với loại khách:");
        System.out.println("1. Diamond");
        System.out.println("2. Platinium");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");

        while (true) {
            try {
                System.out.print("Lựa chọn của bạn là: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());

                CheckExceptions.typeOfGuestCheck(choice);
                switch (choice) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinium";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                }
            } catch (CheckExceptions | NumberFormatException exceptions) {
                System.out.println(exceptions.getMessage());
            }
        }
    }

    private String addaddress() {
        String address;
        System.out.print("Nhập địa chỉ của khách hàng: ");
        address = scanner.nextLine();

        return address;
    }
}
