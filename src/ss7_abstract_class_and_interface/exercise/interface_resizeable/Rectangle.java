package ss7_abstract_class_and_interface.exercise.interface_resizeable;

import ss6_inheritance.practice.shape.Shape;
import ss7_abstract_class_and_interface.exercise.interface_resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 2.0;


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

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng: "
                + getWidth()
                + ", chiều dài: "
                + getLength()
                + ",có diện tích:  "
                + getArea()
                + " và chu vi là: "
                + getPerimeter();

    }

    public void resize(double percent) {
        setLength(getLength() * percent / 100 + getLength());
        setWidth(getWidth() * percent / 100 + getWidth());
    }
}
