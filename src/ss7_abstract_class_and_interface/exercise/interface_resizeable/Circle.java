package ss7_abstract_class_and_interface.exercise.interface_resizeable;

import ss6_inheritance.practice.shape.Shape;
import ss7_abstract_class_and_interface.exercise.interface_resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn bán kính: "
                + getRadius()
                + " có chu vi là: "
                + getPerimeter()
                + " và diện tích là: "
                + getArea();
    }

    public void resize(double percent) {
        setRadius(getRadius() * percent / 100 + getRadius());
    }

}
