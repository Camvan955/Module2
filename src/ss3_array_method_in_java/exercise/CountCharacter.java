package ss3_array_method_in_java.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "abc caa";

        System.out.print("Nhập vào kí tự cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count += 1;
            }
        }
        System.out.println("Kí tự " + c + "xuất hiện " + count + " lần");
    }
}
