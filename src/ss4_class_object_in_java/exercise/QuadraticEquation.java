package ss4_class_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }

    public double getDiscriminant() {
        double detal;
        detal = b * b - 4 * a * c;
        return detal;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào hệ số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép là x= " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có hai nghiệm là x1= " + quadraticEquation.getRoot1() + " và x2= " + quadraticEquation.getRoot2());
        }
    }
}

