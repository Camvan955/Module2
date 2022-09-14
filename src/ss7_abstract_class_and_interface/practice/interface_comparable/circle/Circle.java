package ss7_abstract_class_and_interface.practice.interface_comparable.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private boolean filled= true;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính là: "
                +getRadius()
                + ", màu "
                +getColor()
                + " và diện tích là: "
                +getArea();
    }
}
