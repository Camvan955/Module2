package furama_resort.utils.validata;

import furama_resort.utils.exceptions.*;
import ss19_string_regex.exercise.exercise_plus.ultis.CheckGenderException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateUtils {
    private static Scanner scanner = new Scanner(System.in);


    public static String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Enter employee code: ");
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

    public static String addName() {
        String name;
        while (true) {
            try {
                System.out.print("Enter employee name: ");
                name = scanner.nextLine();

                String regex = "^([A-ZĐ][a-záàảãạăâắằấầặẵẫêậẩéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";

                if (!name.matches(regex)) {
                    throw new CheckNameException("Wrong format");
                }
                break;
            } catch (CheckNameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static LocalDate addDayBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dayOfBirth;
        while (true) {
            try {
                System.out.print("Enter employee day of birth: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(),formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Wrong format");
            }
        }
        return dayOfBirth;
    }

    public static String addGender() {
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

    public static String addidentityCard() {
        String identityCard;
        while (true) {
            try {
                System.out.print("Enter employee identity card: ");
                identityCard = scanner.nextLine();
                if (!identityCard.matches("^[0-9]{9}$")) {
                    throw new CheckIdentityCardException("Wrong format");
                }
                break;
            } catch (CheckIdentityCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return identityCard;
    }


    public static String addphoneNumber() {
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Enter employee phone number: ");
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("^[0][0-9]{9}$")) {
                    throw new CheckPhoneNumberException("Wrong format");
                }
                break;
            } catch (CheckPhoneNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return phoneNumber;
    }

    public static String email() {
        String email;
        while (true) {
            try {
                System.out.print("Enter employee email: ");
                email = scanner.nextLine();
                if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    throw new CheckEmailException("Wrong format");
                }
                break;
            } catch (CheckEmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }

    public static String level() {
        String level = "";
        int choice;
        System.out.println("Enter employee level: ");
        System.out.println("1.Intermediate");
        System.out.println("2. College");
        System.out.println("3. University");
        System.out.println("4.After University");
        System.out.print("Your choice: ");

        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Intermediate";
            case 2:
                return "College";
            case 3:
                return "University";
            case 4:
                return "After University";
            default:
                System.out.println("Wrong format");
        }
        return level;
    }

    public static String location() {
        String location = "";
        int choice;
        System.out.println("Enter employee location: ");
        System.out.println("1. Receptionist");
        System.out.println("2. Service");
        System.out.println("3. Expert");
        System.out.println("4. Monitor");
        System.out.println("5. Manage");
        System.out.println("6. Director");

        System.out.print("Your choice: ");
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                location = "Receptionist";
                break;
            case 2:
                location = "Service";
                break;
            case 3:
                location = "Expert";
                break;
            case 4:
                location = "Monitor";
                break;
            case 5:
                location = "Manage";
                break;
            case 6:
                location = "Director";
                break;
            default:
                System.out.println("Wrong format");
        }
        return location;
    }

    public static Double salary() {
        Double salary;
        while (true) {
            try {
                System.out.print(" Enter employee salary: ");
                salary = Double.parseDouble(scanner.nextLine());

                if (salary <= 0) {
                    throw new CheckSalaryException("Wrong format");
                }
                break;
            } catch (CheckSalaryException e) {
                System.out.println(e.getMessage());
            }
        }
        return salary;
    }
}
