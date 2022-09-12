package ss6_inheritance.exercise.circle_and_cylinder.cirlce;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
