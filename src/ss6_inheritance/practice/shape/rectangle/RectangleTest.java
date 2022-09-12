package ss6_inheritance.practice.shape.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangcle rectangle = new Rectangcle();
        System.out.println(rectangle);

        rectangle = new Rectangcle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangcle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }

}
