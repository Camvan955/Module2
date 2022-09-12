package ss6_inheritance.exercise.circle_and_cylinder.cirlce.cylinder;

import ss6_inheritance.exercise.circle_and_cylinder.cirlce.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Hình trụ {" + " có chiều cao = " + height + ", mặt đáy " + super.toString() + ", thể tích là: " + getVolume() +
                '}';
    }
}
