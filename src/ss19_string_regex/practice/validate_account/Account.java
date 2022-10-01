package ss19_string_regex.practice.validate_account;

import java.util.Scanner;

public class Account {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào account: ");
        String account = sc.nextLine();
        System.out.println(account.matches(ACCOUNT_REGEX));
    }
}
