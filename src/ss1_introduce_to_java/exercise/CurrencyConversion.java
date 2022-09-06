package ss1_introduce_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhạp vao so tien USD: ");
        usd = sc.nextDouble();
        double rate = 23000 * usd;
        System.out.println("gia tri chuyen doi sang VND la: " + rate);

    }
}
