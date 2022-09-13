package ss6_inheritance.practice.shape.triangle;

import ss6_inheritance.practice.shape.Shape;

public class Triangle extends Shape {
    private double side_1 = 1.0;
    private double side_2 = 1.0;
    private double side_3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    public Triangle(String color, boolean filled, double side_1, double side_2, double side_3) {
        super(color, filled);
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    public double getSide_1() {
        return side_1;
    }

    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    public double getSide_3() {
        return side_3;
    }

    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }

}
