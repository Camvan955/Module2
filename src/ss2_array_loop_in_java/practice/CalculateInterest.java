package ss2_array_loop_in_java.practice;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;

        Scanner input = new Scanner(System.in);

        System.out.println(" Nhap vao so tien muon gui: ");
        money = input.nextDouble();
        System.out.println(" Nhap vao so thang gui: ");
        month = input.nextInt();
        System.out.println("Nhap lai suat theo thang: ");
        interestRate = input.nextDouble();

        double totalInterst = 0;
        for (int i = 0; i < month; i++) {

            totalInterst += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("tong so tien khi het han vay la: " + totalInterst);

    }
}
