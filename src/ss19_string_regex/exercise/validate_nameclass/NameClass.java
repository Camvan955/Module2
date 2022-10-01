package ss19_string_regex.exercise.validate_nameclass;

import java.util.Scanner;

public class NameClass {
    public static final String NAME_CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên lớp: ");
        String nameClass = sc.nextLine();

        boolean check = nameClass.matches(NAME_CLASS_REGEX);

        if (check) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
