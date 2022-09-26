package ss15_exception_debug.exercise.illegaltrianglexception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double leg1, leg2, leg3;
        while (true) {

            try {
                System.out.println("Nhập vào canh thứ nhất của tam giác: ");
                leg1 = sc.nextDouble();
                checkLeg(leg1);
                break;
            } catch (ILlegalTriangleException e) {
                e.printStackTrace();
            }
        }

        while (true) {

            try {
                System.out.println("Nhập vào canh thứ hai của tam giác: ");
                leg2 = sc.nextDouble();
                checkLeg(leg2);
                break;
            } catch (ILlegalTriangleException e) {
                e.printStackTrace();
            }
        }

        while (true) {

            try {
                System.out.println("Nhập vào canh thứ ba của tam giác: ");
                leg3 = sc.nextDouble();
                checkLeg(leg3);
                checkLeg(leg1, leg2, leg3);
                break;
            }

            catch (ILlegalTriangleException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Các cạnh nhập vào của tam giác lần lượt là: " + leg1 + "," + leg2 + "," + leg3);

    }

    public static void checkLeg(double leg) throws ILlegalTriangleException {

        if (leg < 0) {
            throw new ILlegalTriangleException("Độ dài cạnh nhập vào bé hớn 0!");
        }
    }

    public static void checkLeg(double leg1, double leg2, double leg3) throws ILlegalTriangleException {

        if ((leg1 + leg2) < leg3 || (leg2 + leg3) < leg1 || (leg1 + leg3) < leg2) {
            throw new ILlegalTriangleException("Tổng hai cạnh bé hơn cạnh còn lại");
        }
    }
}
