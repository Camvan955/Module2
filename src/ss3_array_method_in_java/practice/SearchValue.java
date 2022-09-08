package ss3_array_method_in_java.practice;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten sinh vien can tim: ");
        String nameStudent= scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                System.out.println(" Sinh vien " + nameStudent +" co ten trong mang va nam o vi tri: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay sinh vien co ten " + nameStudent );
        }
    }
}
