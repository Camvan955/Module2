package ss7_abstract_class_and_interface.practice.interface_comparator;

import ss7_abstract_class_and_interface.practice.interface_comparable.circle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println(" Chưa sắp sếp: ");
        for(Circle circle: circles) {
            System.out.println(circle);
        }

        Comparator circleCompator = new CircleComparator();
        Arrays.sort(circles, circleCompator);

        System.out.println("Đã sắp xếp: ");
        for(Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
