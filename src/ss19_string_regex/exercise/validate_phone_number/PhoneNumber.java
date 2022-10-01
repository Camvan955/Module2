package ss19_string_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumber {

    public static final String PHONE_NUMBER = "^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số điện thoại: ");
        String phoneNumber = sc.nextLine();

        boolean checknumber = phoneNumber.matches(PHONE_NUMBER);

        if (checknumber) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
