package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("Hình tròn bán kính: " + circle.getRadius() + "cm có diện tích là: " +circle.getArea());
    }
}
