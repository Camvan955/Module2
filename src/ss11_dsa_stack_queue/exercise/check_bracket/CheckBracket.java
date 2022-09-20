package ss11_dsa_stack_queue.exercise.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức cần kiềm tra: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                System.out.println("Sai");
                return;
            } else if (str.charAt(i) == '(') {
                stack.push((str.charAt(i)) + "");
            } else if (str.charAt(i) == ')') {
                if (stack.size() == 0) {
                    System.out.println("Sai");
                    return;
                }
                stack.pop();

            }
        }
        if (stack.isEmpty()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }

    }


}
