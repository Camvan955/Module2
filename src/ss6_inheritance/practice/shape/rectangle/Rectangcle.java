package ss6_inheritance.practice.shape.rectangle;

import ss6_inheritance.practice.shape.Shape;

public class Rectangcle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangcle() {

    }

    public Rectangcle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangcle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {

        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
