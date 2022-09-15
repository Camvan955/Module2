package ss7_abstract_class_and_interface.exercise.interface_colorable;

import ss6_inheritance.practice.shape.Shape;

public class Rectangle extends Shape implements Colorable {
    private double width;
    private double length;

    public Rectangle(double length, double width) {
    }


    public void Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void howToColor() {
    }

}
