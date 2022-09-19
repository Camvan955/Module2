package ss11_dsa_stack_queue.exercise.optinal_1;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Stack<String> stackNumber = new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào số hệ thập phân: ");
        int decimal = Integer.parseInt(sc.nextLine());

        while(decimal > 0) {
            int surplus = decimal % 2;
            stackNumber.push(surplus + "");
            decimal = decimal / 2;
        }

        System.out.print("Số nhị phân là: ");
        int number= stackNumber.size();
        for (int i = 0; i < number; i++) {
                System.out.print(stackNumber.pop());
            }
        }
    }

