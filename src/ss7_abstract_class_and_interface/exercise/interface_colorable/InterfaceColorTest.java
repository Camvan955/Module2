package ss7_abstract_class_and_interface.exercise.interface_colorable;

public class InterfaceColorTest {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[2];
        geometries[0] = new Square(3);
        geometries[1] = new Circle(5);

        for (Geometry geometry : geometries) {
            if (geometry instanceof Square) {
                System.out.println(geometry.getArea());
                ((Square) geometry).howToColor();
            }
        }
    }

}
