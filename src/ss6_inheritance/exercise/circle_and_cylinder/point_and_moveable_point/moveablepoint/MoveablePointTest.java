package ss6_inheritance.exercise.circle_and_cylinder.point_and_moveable_point.moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2.0f,2.5f,3.1f,4.2f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
