package furama_resort.services.impl;

import furama_resort.models.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.utils.exception.CheckExceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayList() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        Employee employee = this.info();
        employeeList.add(employee);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void edit() {
        System.out.print("Nhập mã khách hàng cần chỉnh sửa: ");
        String code = scanner.nextLine();

        boolean isCode = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(code)) {
                Employee employee = this.info();
                employeeList.set(i, employee);
                isCode = false;
                break;
            }
        }
        if (isCode) {
            System.out.println("Không tìm thấy khách hàng với mã vừa nhập!");
        }

    }


    private Employee info() {
        String id = addCode();
        String name = addName();
        LocalDate dayOfBirth = addDayBirth();
        String gender = addGender();
        String identityCard =addidentityCard();
        String phoneNumber = addphoneNumber();
        String email = addEmail();
        String level = addLevel();
        String location = addLocation();
        Double salary = addSalary();

        Employee employee = new Employee(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, level, location, salary);
        return employee;

    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Nhập mã nhân viên: ");
                code = scanner.nextLine();
                if (CheckExceptions.codeCheck(code)) {
                    return code;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public LocalDate addDayBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dayOfBirth;
        while (true) {
            try {
                System.out.print("Ngày ngày sinh của nhân viên: ");
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
                System.out.print("Nhập tên nhân viên: ");
                name = scanner.nextLine();
                if (CheckExceptions.nameCheck(name)) {
                    return name;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Nhập giới tính nhân viên: ");
                gender = scanner.nextLine();
                if (CheckExceptions.genderCheck(gender)) {
                    return gender;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String addidentityCard() {
        String identityCard;
        while (true) {
            try {
                System.out.print("Nhập căn cước công dân của nhân viên: ");
                identityCard = scanner.nextLine();
                if (CheckExceptions.idCardCheck(identityCard)) {
                    return identityCard;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public  String addphoneNumber() {
        String phoneNumber;
        while(true) {
            try{
                System.out.print("Nhập số điện thoại của nhân viên: ");
                phoneNumber = scanner.nextLine();
                if(CheckExceptions.phoneNumberCheck(phoneNumber)) {
                    return phoneNumber;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String addEmail() {
        String email;
        while (true){
            try{
                System.out.print("Nhập email của nhân viên: ");
                email= scanner.nextLine();
                if(CheckExceptions.emailCheck(email)) {
                    return email;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static String addLevel() {
        String level = "";
        int choice;
        System.out.println("Nhập trình độ của nhân viên bao gồm: ");
        System.out.println("1.Trung cấp");
        System.out.println("2. Cao đẳng");
        System.out.println("3. Đại học");
        System.out.println("4.Sau đại học");
        System.out.print("Nhập lựa chọn của bạn: ");

        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Trung cấp";
            case 2:
                return "Cao đẳng";
            case 3:
                return "Đại học";
            case 4:
                return "Sau đại học";
            default:
                System.out.println("Không đúng định dạng, mời nhập lại");
        }
        return level;
    }

    public static String addLocation() {
        String location = "";
        int choice;
        System.out.println("Nhập vị trí của nhân viên bao gồm: ");
        System.out.println("1. Lễ tân");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên");
        System.out.println("4. Giám sát");
        System.out.println("5. Quản lý");
        System.out.println("6. Giám đốc");

        System.out.print("Nhập lựa chọn của bạn: ");
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                location = "Lễ tân";
                break;
            case 2:
                location = "Phục vụ";
                break;
            case 3:
                location = "Chuyên viên";
                break;
            case 4:
                location = "Giám sát";
                break;
            case 5:
                location = "Quản lý";
                break;
            case 6:
                location = "Giám đốc";
                break;
            default:
                System.out.println("Không đúng định dạng, mời nhập lại");
        }
        return location;
    }

    public Double addSalary() {
        Double salary;
        while (true) {
            try {
                System.out.print("Nhập lương của nhân viên: ");
                salary = Double.parseDouble(scanner.nextLine());
                if(CheckExceptions.salaryCheck(salary)) {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


