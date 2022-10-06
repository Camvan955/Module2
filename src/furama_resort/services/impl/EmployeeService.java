package furama_resort.services.impl;

import furama_resort.models.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.utils.exception.CheckExceptions;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String EMPLOYEE_FILE = "src\\furama_resort\\data\\employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void displayList() {
        employeeList = readFileEmployee();

        if (employeeList.size() == 0) {
            System.out.println("Không có danh sách nhân viên để hiển thị!");
        }
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        employeeList = readFileEmployee();

        Employee employee = this.infoEmployee();
        employeeList.add(employee);

        writeEmployeeFile(employeeList);

        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void edit() {
        employeeList = readFileEmployee();

        System.out.print("Nhập mã khách hàng cần chỉnh sửa: ");
        String code = scanner.nextLine();

        boolean isCode = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(code)) {
                Employee employee = this.infoEmployee();
                employeeList.set(i, employee);
                isCode = false;
                System.out.println("Chỉnh sửa nhân viên thành công!");
                break;
            }
        }
        if (isCode) {
            System.out.println("Không tìm thấy khách hàng với mã vừa nhập!");
        }

        writeEmployeeFile(employeeList);

    }

    private Employee infoEmployee() {
        String id = addCode();
        String name = addName();
        LocalDate dayOfBirth = addDayBirth();
        String gender = addGender();
        String identityCard = addidentityCard();
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
                if (CheckExceptions.codeEmployeeCheck(code)) {
                    return code;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public LocalDate addDayBirth() {
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

    public String addphoneNumber() {
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

    public String addEmail() {
        String email;
        while (true) {
            try {
                System.out.print("Nhập email của nhân viên: ");
                email = scanner.nextLine();
                if (CheckExceptions.emailCheck(email)) {
                    return email;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static String addLevel() {
        int choice;
        System.out.println("Nhập trình độ của nhân viên bao gồm: ");
        System.out.println("1.Trung cấp");
        System.out.println("2. Cao đẳng");
        System.out.println("3. Đại học");
        System.out.println("4.Sau đại học");

        while (true) {
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                CheckExceptions.levelCheck(choice);
                switch (choice) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau đại học";
                }
            } catch (CheckExceptions | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String addLocation() {
        int choice;
        System.out.println("Nhập vị trí của nhân viên bao gồm: ");
        System.out.println("1. Lễ tân");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên");
        System.out.println("4. Giám sát");
        System.out.println("5. Quản lý");
        System.out.println("6. Giám đốc");

        while (true) {
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());

                CheckExceptions.locationCheck(choice);
                switch (choice) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                }
            } catch (CheckExceptions | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Double addSalary() {
        Double salary;
        while (true) {
            try {
                System.out.print("Nhập lương của nhân viên: ");
                salary = Double.parseDouble(scanner.nextLine());
                if (CheckExceptions.salaryCheck(salary)) {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static List<Employee> readFileEmployee() {
        employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File("src\\furama_resort\\data\\employee.csv");
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                employeeList.add(new Employee(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Không đọc được file!");
        }
        return employeeList;
    }

    public void writeEmployeeFile(List<Employee> employeeList) {
        File file = new File(EMPLOYEE_FILE);
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getEmployeeInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Không mở được file");
        }


    }
}


