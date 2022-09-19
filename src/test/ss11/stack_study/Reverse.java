package test.ss11.stack_study;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Stack<String> stackString = new Stack<>();

        // đảo ngược chuỗi
        System.out.print("Nhập vào chuỗi: ");
        String str= sc.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(stackString.push(str.charAt(i) +""));
        }
        System.out.println("Chuỗi khi được đảo ngược: ");
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(stackString.pop());
        }
    }
}
