package ss6_inheritance.exercise.circle_and_cylinder.cirlce.cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.5, 3, "hồng");
        System.out.println(cylinder.toString());

        cylinder = new Cylinder(2.0,5.0,"brown");
        System.out.println(cylinder.toString());
    }
}
