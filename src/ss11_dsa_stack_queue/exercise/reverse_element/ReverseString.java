package ss11_dsa_stack_queue.exercise.reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        Stack<String> stackString = new Stack<>();

        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần đảo ngược: ");
        String str = scanner.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            stackString.push(str.charAt(i) +"");
        }

        System.out.print("Chuỗi sau khi được đảo ngược là: ");
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(stackString.pop());
        }
    }

}
