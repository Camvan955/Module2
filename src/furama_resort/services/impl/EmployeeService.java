package furama_resort.services.impl;

import furama_resort.models.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.utils.exceptions.*;
import ss19_string_regex.exercise.exercise_plus.ultis.CheckGenderException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void displayList() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
//        Employee employee =

    }

    @Override
    public void edit() {

    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }

//    private Employee info() {
//        String code = addCode();
//    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.println("Enter employee code");
                code = scanner.nextLine();
                if (!code.matches("^[N][V][0-9]{3,6}$")) {
                    throw new CheckCodeException("Wrong format");
                }
                break;
            } catch (CheckCodeException e) {
                System.out.println(e.getMessage());
            }
        }
        return code;
    }

    private String addName() {
        String name;
        while (true) {
            try {
                System.out.println("Enter employee name: ");
                name = scanner.nextLine();
                String[] str = name.trim().split("");
                String regex = "^([A-ZĐ][a-záàảãạăâắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
                for (int i = 0; i < str.length; i++) {
                    if (!str[i].matches(regex)) {
                        throw new CheckNameException("Wrong format");
                    }

                }
                break;
            } catch (CheckNameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    private LocalDate addDayBirth() {
        LocalDate dayOfBirth;
        while (true) {
            try {
                System.out.print("Enter employee day of birth: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Wrong format");
            }
        }
        return dayOfBirth;
    }

    private String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Enter employee gender: ");
                gender = scanner.nextLine();
                if (!gender.matches("^[NKamhngữô]+$")) {
                    throw new CheckGenderException("Wrong format");
                }
                break;
            } catch (CheckGenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    private int identityCard() {
        int identityCard;
        while (true) {
            try {
                System.out.println("Enter employee identity card");
                identityCard = Integer.parseInt(scanner.nextLine());
                if (!String.valueOf(identityCard).matches("^[0-9]{9}$")) {
                    throw new CheckIdentityCardException("Wrong format");
                }
                break;
            } catch (CheckIdentityCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return identityCard;
    }

    private int phoneNumber() {
        int phoneNumber;
        while (true) {
            try {
                System.out.println("Enter employee phonenumber");
                phoneNumber = Integer.parseInt(scanner.nextLine());
                if(!String.valueOf(phoneNumber).matches("^[0][0-9]{8}$")){
                    throw new CheckPhoneNumberException("Wrong format");
                }
                break;
            } catch (CheckPhoneNumberException e) {
                e.printStackTrace();
            }
        }
        return phoneNumber;
    }

    private String email() {
        String email;
        while(true) {
            try {
                System.out.println("Enter employee email");
                email = scanner.nextLine();
                if(!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    throw new CheckEmailException("Wrong format");
                }
                break;
            } catch (CheckEmailException e) {
                e.printStackTrace();
            }
        }
        return email;
    }
}
