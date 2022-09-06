package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class MbiCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhap can nang: ");
        weight = scanner.nextDouble();

        System.out.println("Nhap chieu cao: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18.5)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
