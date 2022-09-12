package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // public và default thì chương trình vẫn chạy
    // proteted thì chỉ thực thi được getRadius() còn getArea() thì không
    //private lỗi biên dịch
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI ;
    }
}
